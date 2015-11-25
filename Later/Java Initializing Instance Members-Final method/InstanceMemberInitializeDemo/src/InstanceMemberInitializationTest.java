public class InstanceMemberInitializationTest
{
	public int capacity = initializeInstanceVariable();

	protected final int initializeInstanceVariable()
	{

		System.out.println("Inside final method.");

		// initialize to 10
		capacity = 10;
		return capacity;
	}

	public static void main(String args[])
	{
		System.out.println("capacity : "
				+ new InstanceMemberInitializationTest().capacity);

	}
}
