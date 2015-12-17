public class OverloadingExample
{

	public void add(int a, int b)
	{
		int total = a + b;
		System.out.println("total : " + total);
	}

	public void display(int a, int b, int c)
	{
		int total = a + b + c;
		System.out.println("total : " + total);
	}

}
