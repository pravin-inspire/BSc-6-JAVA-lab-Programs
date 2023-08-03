class P7
{
	int add(int a, int b) //same name
	{
		return a+b;
	}

	float add(float x, float y) //same name
	{
		return x+y;
	}

	String add(String s1, String s2) //same name
	{
		return (s1+s2);
	}

	public static void main(String args[])
	{
		P7 s1 = new P7();
		System.out.println(s1.add(10,20));
		System.out.println(s1.add(10.3,50.5));
		System.out.println(s1.add("Hello"," World!"));
	}
}
