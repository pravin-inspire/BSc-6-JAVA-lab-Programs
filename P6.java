//program 06:Demonstrate user defined package program.
//Author:
//Date:

//create a folder named "package"
//place classA.java inside package and just compile it
//save packageTest1.java outside of "package" folder
//compile packageTest1 outside of "package" folder
//run packageTest1

package package1;

public class classA
{
	public void displayA()
	{
		System.out.println("class A of package1");
	}
}//classA

//----------------------------------------------------------//

import package1.classA; //importing classA of package1

class packageTest1
{
	public static void main(String args[])
	{
		classA objectA=new classA(); //objectA is object of classA
		objectA.displayA(); //calling object of classA

	}//end of main
} //end of packageTest1
