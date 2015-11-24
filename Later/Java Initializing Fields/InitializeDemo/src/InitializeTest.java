public class InitializeTest
{
	// initialize to 10
	public int capacity = 10;

	// initialize to false
	private boolean flag = false;

	public InitializeTest()
	{
		super();
	}

	/*
	 * Instance variables can be initialized in constructors, where error
	 * handling or other logic can be used
	 */
	public InitializeTest(int capacity, boolean flag)
	{
		super();
		this.capacity = capacity;
		this.flag = flag;
	}

	public static void main(String args[])
	{

		InitializeTest initializeTest = new InitializeTest();
		System.out.println("capacity : " + initializeTest.capacity);
		System.out.println("flag     : " + initializeTest.flag);

		System.out.println("---------------------------------------");

		InitializeTest initializeTest1 = new InitializeTest(200, true);
		System.out.println("capacity : " + initializeTest1.capacity);
		System.out.println("flag     : " + initializeTest1.flag);
	}
}
