//Program 15: Implement Digital Clock.
//Author
//Date

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class P15 extends Applet implements MouseListener //inheritance, interface
{ 
	Label d = new Label();
	
	public void init() //used to initialize the Applet
	{
		setLayout(null);
		d.setBounds(20,50,100,20);
		add(d);
		addMouseListener(this);
	}

	//mouse events
	public void mouseClicked(MouseEvent e)
	{
		d.setText("Mouse Clicked");
	}
	
	public void mouseEntered(MouseEvent e)
	{
		d.setText("Mouse Entered");
	}
	
	public void mouseExited(MouseEvent e) 
	{
		d.setText("Mouse Exited");
	}
	
	public void mousePressed(MouseEvent e)
	{
		d.setText("Mouse Pressed");
	}
	
	public void mouseReleased(MouseEvent e)
	{
		d.setText("Mouse Released");
	}
}

//HTML code to run applet inside appletviewer
/*<applet code="P15" width="200" height="200"></applet>*/