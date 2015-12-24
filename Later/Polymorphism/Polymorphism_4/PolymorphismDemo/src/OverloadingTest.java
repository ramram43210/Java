public class OverloadingTest
{

	public int add(int x, int y)
	{
		return x + y;
	}

	public int add(int x, int y, int z)
	{
		return x + y + z;
	}

	public int add(double x, int y)
	{
		return (int) x + y;
	}

	public int add(int x, double y)
	{
		return x + (int) y;
	}

	public static void main(String[] args)
	{
		OverloadingTest overloadingTest = new OverloadingTest();
		System.out.println(overloadingTest.add(4, 3));
		System.out.println(overloadingTest.add(2, 3, 4));
		System.out.println(overloadingTest.add(2.5, 3));
		System.out.println(overloadingTest.add(9, 3.4));
	}

}
