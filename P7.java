//program 07: Demonstrate illustrate Method Overloading.
//Author:
//Date:

import java.io.*;

class rect
{
	double length,breadth;
	
	void room(double x,double y) //accepts two arguments
	{
		length=x;
		breadth=y;
	}
	
	void room(double x) //accepts one argument but assigns for both
	{
		length=breadth=x; //assign value of x to both length and breadth
	}
	
	double area() //calculates area
	{
		return(length*breadth);
	}
}//end of class rect

class example
{
	public static void main(String args[]) //main
	{
		double a1,a2; //a1, a2 to store area calculated
		
		rect r1= new rect(); //r1 is object of class rect
		rect r2= new rect(); //r2 is object of class rect
		
		r1.room(4.5,5.0);//two arguments passed
		r2.room(5.0); //only one argument passed
		
		a1=r1.area(); //calls area() method with two arguments
		a2=r2.area(); //calls area() method with one argument
		
		System.out.println("Area= " +a1);
		System.out.println("Area= " +a2);
	}//end of main
}//end of class
