class Display
{
	private String str;

	public Display()
	{
		str = "Welcome";
	}

	public void method1()
	{
		System.out.println("Inside method1,The string is " + str);
	}

	public void method2(int n)
	{
		System.out.println("\nInside method2,The number is " + n);
	}

	private void method3()
	{
		System.out.println("Private method invoked");
	}
}
