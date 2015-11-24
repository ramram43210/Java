public class StaticInitializationTest
{
	public static int capacity = initializeClassVariable(10);

	private static int initializeClassVariable(int value)
	{
		// initialize to 10
		capacity = value;
		return capacity;
	}

	public static void main(String args[])
	{
		System.out.println("capacity : " + capacity);
		
		int changedCapacity =initializeClassVariable(200);
		System.out.println("changedCapacity : "+changedCapacity);

	}
}
