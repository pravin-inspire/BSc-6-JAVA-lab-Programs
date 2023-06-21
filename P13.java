//Program 13: Display Hello World and change the foreground color randomly.
//Author:
//Date:

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class P13 extends Applet
{
	public void paint(Graphics G)
	{
		Random rand=new Random();
		int r = rand.nextInt(255);
		int g = rand.nextInt(255);
		int b = rand.nextInt(255);
		Color clr =new Color(r,g,b);
		setForeground(clr);
		G.drawString("Hello World!", 50,50);
		
		try
		{
			Thread t = new Thread(); //t is object of class Thread()
			t.sleep(1000);
		}
		catch(InterruptedException e)
		{
		}
	}
}

/*<applet code="P13" width="200" height="200"></applet>*/
