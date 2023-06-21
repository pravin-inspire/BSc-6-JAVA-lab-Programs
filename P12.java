//Program 12: Change the background color of the applet randomly.
//Author:
//Date:

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class P12 extends Applet
{
	public void paint(Graphics G)
	{
		Random rand=new Random(); //rand is object of Random class
		int r = rand.nextInt(255);
		int g = rand.nextInt(255);
		int b = rand.nextInt(255);
		Color clr =new Color(r,g,b);
		setBackground(clr);
		
		try
		{
			Thread t = new Thread();
			t.sleep(1000);
		}
		catch(InterruptedException e)
		{
		}
	}//end of paint
}//end of class P12

/*<applet code="P12" width="200" height="200"></applet>*/
