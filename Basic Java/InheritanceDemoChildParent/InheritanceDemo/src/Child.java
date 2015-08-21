class Parent
{
	String parentProperty = "Property of Parent";

	public void parentMethod()
	{
		System.out.println("Parent method");
	}
}

public class Child extends Parent
{
	String childProperty = "Property of Child";

	public void childMethod()
	{
		System.out.println("Child method");
	}

	public static void main(String[] args)
	{
		Child childObject = new Child();

		/*
		 * Using child Object we can access child properties and parent
		 * properties because Child class extends Parent Class.
		 */
		System.out.println(childObject.childProperty);
		System.out.println(childObject.parentProperty);

		/*
		 * Using child Object we can access child methods and parent methods
		 * because Child class extends Parent Class.
		 */

		childObject.childMethod();
		childObject.parentMethod();

	}
}