//Program 02: Display the N Prime numbers using command line argument
//Author: Praveen Hanchinal
//Date: 15-05-2023

import java.io.*;
class Prime
{
	public static void main(String args[])
	{
		int low,high,i,flag;

		low=Integer.parseInt(args[0]);
		high=Integer.parseInt(args[1]);
		
		//parseInt function is to extract a number from a string

		System.out.println(+low);
		System.out.println(+high);
		System.out.println("prime numbers between low and high");
		
		while(low<high)
		{
			flag=0;
			if(low<=1) //exclude 1 as it not prime
			{
				++low;
				continue;
			}

			for(i=2;i<=low/2;++i)
			{
				if(low%i==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(+low);
			}
			++low;
		}// end of while
	} //end of main
} //end of class