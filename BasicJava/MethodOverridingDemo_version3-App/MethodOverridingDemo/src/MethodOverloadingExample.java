public class MethodOverloadingExample
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
	
	public static void main(String args[])
	{
		MethodOverloadingExample methodOverloadingExample= new MethodOverloadingExample();
		
		//Call two parameter add method
		methodOverloadingExample.add(2,2);
		//Call three parameter add method
		methodOverloadingExample.add(5, 5, 5L);		
	}

}
