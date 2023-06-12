//program 4: Demonstrate Multithreading
//Author:
//Date:


import java.io.*;

class A extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            if(i==1)
            {
                yield();
            }
            System.out.println("From Thread A:i=" +i);
        }
        System.out.println("exit from A");
    }
}//end of class A

class B extends Thread
{
    public void run()
    {
        for(int j=1;j<=5;j++)
        {
            if(j==3)
            {
                stop();
                  System.out.println(
                "Thread " + Thread.currentThread().getId()
                + " is running");
            }
        }   
        System.out.println("exit from B");
    }
}//end of class B

class C extends Thread
{
    public void run()
    {
        for(int k=1;k<=5;k++)
        {
            System.out.println("From Thread C:k=" +k);
            if(k==1)
            {   
                try
                {
                   sleep(1000);
                }

                catch (Exception e)
                {
                }
            }
       }
       System.out.println("Exit from C");
   }
}// end of class C

class MThread
{
    public static void main (String args[])
    {
        A threadA = new A();
        B threadB = new B();
        C threadC = new C();

        System.out.println("Start thread A");
        threadA.start();

        System.out.println("Start thread B");
        threadB.start();

        System.out.println("Start thread C");
        threadC.start();

        System.out.println("End of the main thread");

    }//end of main
}//end of class MThread
