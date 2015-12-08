public class InitializeConstructorTest
{
	
	public int capacity;

	private boolean flag;

	/*
	 * Instance variables can be initialized in constructors, where error
	 * handling or other logic can be used
	 */
	public InitializeConstructorTest(int capacity, boolean flag)
	{
		if(capacity > 200)
		{
			this.capacity = capacity;
		}
		else
		{
			this.capacity = 0;
		}
		this.flag = flag;
	}

	public static void main(String args[])
	{

		InitializeConstructorTest initializeConstructorTest = new InitializeConstructorTest(100, true);
		System.out.println("capacity : " + initializeConstructorTest.capacity);
		System.out.println("flag     : " + initializeConstructorTest.flag);
	}
}
