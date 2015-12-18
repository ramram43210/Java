public class OverloadingExample
{

	public void add(int a, int b)
	{
		int total = a + b;
		System.out.println("total : " + total);
	}

	public void add(int a, int b, long c)
	{
		long total = a + b + c;
		System.out.println("total : " + total);
	}

}
