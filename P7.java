//program 07:Demonstrate Method Overloading 
//Author:
//Date:

class P7
{
	int add(int a, int b) //same method name but integer argument
	{
		return a+b;
	}

	float add(float x, float y) //same method name but decimal no argument
	{
		return x+y;
	}

	String add(String s1, String s2) //same method name but string argument
	{
		return (s1+s2);
	}

	public static void main(String args[])
	{
		P7 s1 = new P7(); //s1 object of P7 class
		System.out.println(s1.add(10,20));
		System.out.println(s1.add(10.3f,50.5f));
		System.out.println(s1.add("Hello"," World!"));
	}
}
