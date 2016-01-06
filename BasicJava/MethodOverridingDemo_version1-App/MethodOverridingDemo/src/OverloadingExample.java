public class OverloadingExample
{

	public void add(int a, int b)
	{
		int total = a + b;
		System.out.println("total : " + total);
	}

	public void add(int a, int b, int c)
	{
		int total = a + b + c;
		System.out.println("total : " + total);
	}
	
	public static void main(String args[])
	{
		OverloadingExample overloadingExample= new OverloadingExample();
		
		//Call two parameter add method
		overloadingExample.add(2,2);
		//Call three parameter add method
		overloadingExample.add(5, 5, 5);		
	}

}
