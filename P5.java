//program 05: Demonstrate Exception Handling
//Author:
//Date:


import java.io.*;
class ExHand
{
	public static void main(String args[])
	{
		int a=10,b=5,c=5,x,y;
		
		try
		{
			x=a/(b-c); //creates exception of division 
		}
		
		catch(ArithmeticException e) //catches the exception occurred
		{
			System.out.println("Division by zero error");
		}
		
		y=a/(b+c); //executes when there is no exception
		System .out.println("y=" +y);
	}
}
