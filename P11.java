//Program 11: Illustrate Scroll bar object.
//Author:
//Date:


import java.awt.*;
import java.awt.event.*;
import java.applet.*;

//extends->inheritance, implements->interface

public class P11 extends Applet implements AdjustmentListener
{
	Scrollbar S1 = new Scrollbar(Scrollbar.VERTICAL,10,1,0,255);
	Label L1 = new Label("10",Label.CENTER);
	
	public void init()
	{
		add(S1);
		add(L1);
		S1.addAdjustmentListener(this);
	}
	
	public void adjustmentValueChanged(AdjustmentEvent ae)
	{
		int k = S1.getValue();
		String str = String.valueOf(k);
		L1.setText(str);
	}
}

/*<applet code="P11" width="200" height="200"></applet>*/
