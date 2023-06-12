//Program to demonstrate user input

import java.util.Scanner;

//The Scanner class is used to get user input, and it is found in the java.util package

class Abc
{
	public static void main(String[] args)
	{
		//myInput is object using inbuilt Scanner class
		Scanner myInput = new Scanner( System.in ); //System.in is a standard input stream  

		System.out.print( "Enter a integer: " );
		//reads integer via nextInt and stores in a
		int a = myInput.nextInt(); //nextInt() method Scans the next token of the input as an int

		//prints a value
		System.out.print("You Entered " +a);

	}
}