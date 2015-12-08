public class InitializeTest
{
	// initialize to 10
	public int capacity = 10;

	// initialize to false
	private boolean flag = false;

	public InitializeTest()
	{

	}

	public static void main(String args[])
	{

		InitializeTest initializeTest = new InitializeTest();
		System.out.println("capacity : " + initializeTest.capacity);
		System.out.println("flag     : " + initializeTest.flag);

	}
}
