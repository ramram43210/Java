public class Child extends Parent
{

	public static void main(String args[])
	{

		Child child = new Child();

		System.out.println("capacity : " + child.capacity);

		/*
		 * Subclass reusing the initialization method.
		 */
		child.initializeInstanceVariable(200);

		System.out.println("capacity : " + child.capacity);

	}
}
