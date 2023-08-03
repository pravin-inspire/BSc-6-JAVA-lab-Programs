//program 06:Demonstrate user defined package program.
//Author:
//Date:

//--------------------------------ClassA.java-----------------------------------------

package package1;
public class classA
{
	public void displayA()
	{
		System.out.println("You are in classA of package1");
	}
}//end of classA



//--------------------------------ClassB.java-----------------------------------------

package package1;
public class classB
{
	public void displayB()
	{
		System.out.println("You are in classB of package1");
	}
}//end of classB


//-------------------------------TestPackage.java---------------------------------------

import package1.classA; //importing classA of package1
import package1.classB; //importing classB of package1

class TestPackage
{
	public static void main(String args[])
	{
		classA objectA=new classA(); //objectA is object of classA
		objectA.displayA(); //calling object of classA

		classB objectB=new classB(); //objectB is object of classB
		objectB.displayB(); //calling object of classB

	}//end of main
} //end of packageTest1



//---------------Compiling and Run Process------------------

/*

Compile classA and ClassB

D:\PH> javac -d . classA.java
D:\PH> javac -d . classB.java

package1 will be created
The class files of classA and classB will be inside package1

D:\PH> javac TestPackage.java

Running:

java TestPackage

*/