//program 08:Demonstrate Constructor Overloading 
//Author:
//Date:

import java.io.*;

//Constructor: class_name is same as method_name

class addition
{
	double a,b;
	addition(double x,double y) // 1st constructor with name addition
	{
		a=x;
		b=y;;
		System.out.println("sum of 2 float values:= " +(a+b));
	}

	addition(int x,int y) // 2nd constructor with name addition
	{
		int a=x;
		int b=y;
		System.out.println("sum of 2 integer is:= " +(a+b));
	}

	addition(int x,int y,int z) // 3rd constructor with name addition
	{
		int a=x;
		int b=y;
		int c=z;
		System.out.println("sum of 3 integer is:= " +(a+b+c));
	}

}//end of class addition


class constOverload //main class
{
	public static void main(String args[])	//main
	{

		addition a1= new addition(4.5,5.0);	//calls 1st constructor
		addition a2= new addition(15,14);	//calls 2nd constructor
		addition a3= new addition(5,4,6);	//calls 3rd constructor
	
	}//end of main
}//end of class constOverload
