//Program 9: Display Geometrical Figures using objects.
//Author: 
//Date:

//Java applet is a Java program that is launched from HTML and 
//run in a web browser or appletviewer

import java.applet.Applet;	//provides methods of Applet class
import java.awt.Color; 		//AWT is abstract window toolkit (API for GUI)
import java.awt.Graphics;	//provides methods of Graphics class

public class P9 extends Applet //extends->inheritance
{
	public void paint(Graphics g) //super class for all graphics contexts
	{
		g.setColor(Color.GREEN);
		g.drawLine(20,20,100,20);
		g.drawRect(20,50,90,90);
		g.fillRoundRect(130,50,120,70,15,15);
		g.setColor(Color.RED);
		g.drawOval(20,160,160,100);
		g.fillOval(180,160,160,100);
	}
}

//invoking an Applet

/*
<applet code="P9" width="400" height="400"></applet>
*/

/*

Compiling:
D:\PH>javac P13.java

Run:
D:\PH>appletviewer P13.java

*/