//Program 03: Java Program to demonstrate string operations
//Author:
//Date:

import java.io.*;
import java.lang.String; //Contains string functions

class stringexample
{
	public static void main(String args[])
	{
		String s1=new String("GFGC");
		String s2=new String("DHARWAD");
		String s3=null;
		
		// string to uppercase
		s3=s1.toUpperCase();
		System.out.println("The string s1 in upper case is " +s3);

		//string to lowercase
		s3=s1.toLowerCase();
		System.out.println("The string s1 in lower case is " +s3);
		
		//replace F with Y in s1 string
		s3=s1.replace('F','Y'); 
		System.out.println("The string s1 in replace is " +s3); //returns GYGC
		
		//TRIM : removes whitespace from both ends of a string
		String s4;
		s4="    Hello      ";
		s3=s4.trim();
		System.out.println("The string s4 after trim is " +s3);
		
		//Check for equals (with case), return true if equal else false
		System.out.println("The string s1 equals to " +s1.equals(s2)); //returns false
		
		//Cheks for Equal Ignoring case
		System.out.println("The string s1 ignore case is " 
			+s1.equalsIgnoreCase(s2));
		
		//Length of string
		System.out.println("The length of string s2 is " +s2.length());
		
		//Position at a character in string
		System.out.println("the character at given postion at "+s1.charAt(2));
		
		//Compare two strings lexicographically, returns 0 or negative or positive
		System.out.println("the character s1 compare to s2 " +s1.compareTo(s2));
		
		//Concatinate two strings (join)
		System.out.println("the concatinate s1 and s2 "+s1.concat(s2));
		
		//Extract substring of a given string
		System.out.println("the character at given postion at " +s1.substring(2,4));
	}//end of main
}//end of class


