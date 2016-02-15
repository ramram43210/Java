interface A
{
	void sayWelcome();

	void sayHi();

	void sayBye();
}

/*
 * The abstract class can also be used to provide some
 * implementation of the interface. In such case, the end
 * user may not be forced to override all the methods of the
 * interface.
 */
abstract class B implements A
{

	@Override
	public void sayWelcome()
	{
		System.out.println("Welcome...");
	}

}

public class MyClass extends B
{

	@Override
	public void sayHi()
	{
		System.out.println("Hi...");

	}

	@Override
	public void sayBye()
	{
		System.out.println("Bye...");
	}

}
