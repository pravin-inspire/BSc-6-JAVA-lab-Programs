//Program to accept name from user and display on screen

import java.util.*;

class NamePrint  
{  
	public static void main(String[] args)  
	{  
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
		System.out.print("Enter a string: ");  
		String str= sc.nextLine();              //reads string   
		System.out.print("You have entered: "+str); //+str to print          
	}  
}  