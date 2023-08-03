//Program 14: Implement Digital Clock
//Author:
//Date

import java.awt.*;
import java.applet.*;
import java.util.*;// for calendar utility

public class P14 extends Applet implements Runnable 
{ 
   Thread t;
   public void start() //thread start
   {
       t = new Thread(this);
       t.start();
   }//end of start

   public void run() //thread run
   { 
       while(true) 
       {
           repaint();
           try 
           {
               t.sleep(1000); 
           }
           catch(InterruptedException e)
           {

           }
       }
   }//end of run
   
   public void paint(Graphics g) 
   {
      g.drawString("Hello World!", 50,50);
      g.drawString(new setFont("Arial",set.BOLD,50)
   }//end of paint

}//end of P14

/* <applet code="P14" width=200 height=200></applet> */
