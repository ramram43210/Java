public class Parent
{

	public int capacity = initializeInstanceVariable(10);

	protected final int initializeInstanceVariable(int value)
	{

		System.out.println("Inside final method.");

		capacity = value;
		return capacity;
	}

}
