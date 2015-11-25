public class InstanceMemberInitializationTest
{
	public int capacity;

	{
		
		System.out.println("Inside  initializer block.");
		
		// initialize to 10
		capacity = 10;
	}

	public static void main(String args[])
	{
		System.out.println("capacity : "
				+ new InstanceMemberInitializationTest().capacity);

	}
}
