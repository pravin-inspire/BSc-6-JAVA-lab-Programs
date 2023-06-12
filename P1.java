//Program 01: Find the factorial of N numbers using command line argument
//Author: Praveen Hanchinal
//Date: 15-05-2023

import java.io.*;

class Factorial
{
	public static void main(String[] arg)
	{
		int[] num=new int[10];
		
		if(arg.length==0)//checks for NO arguments
		{
			System.out.println("no command line argument passed");
			return;
		}
		
		//read arguments
		for(int i=0;i<arg.length; i++)
		{
			num[i]=Integer.parseInt(arg[i]);
		}

		//calculate factorial for each argument
		for(int i=0;i<arg.length;i++)
		{
			int fact=1;
			for(int j=1;j<=num[i];j++)
			{
				fact *=j;
			}
			System.out.println("the factorial of "+ arg[i]+" is: "+ fact);
		}
	}
}