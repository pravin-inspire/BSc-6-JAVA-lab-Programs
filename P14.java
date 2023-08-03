

//Program 14: Implement Digital Clock
//Author:
//Date:

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;
import java.util.*;
import java.time.LocalTime; //works JDK 8 onwards

public class P14 extends Applet
{
	public void paint(Graphics G)
	{
		
		G.setFont(new Font("Arial",Font.BOLD,40));
		
		
		LocalTime myObj = LocalTime.now(); // Create a time object
		
		G.drawString(myObj.toString(),50,50); //convert time object to string
		
		try
		{
			Thread t = new Thread(); //t is object of class Thread()
			t.sleep(100);
			repaint(); //repaint every 100 millisecs
		}
		catch(InterruptedException e)
		{
		}
	}
}

/*<applet code="P14" width="500" height="500"></applet>*/




