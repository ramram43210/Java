public class SubClass extends Superclass
{

	String name = "John";

	// overrides printMethod in Superclass
	public void printMethod()
	{
		super.printMethod();
		System.out.println("name : " + name);
		System.out.println("super.name : " + super.name);
		System.out.println("Printed in Subclass");
	}

}
