public class StaticInitializationTest
{
	public static int capacity;

	private static boolean flag;

	static
	{
		System.out.println("First Static initialization block is called. ");
		
		// initialize to 10
		capacity = 10;

	}

	static
	{
		System.out.println("Second Static initialization block is called. ");

		// initialize to false
		flag = true;
	}

	public static void main(String args[])
	{
		System.out.println("capacity : " + capacity);
		System.out.println("flag     : " + flag);

	}
}
