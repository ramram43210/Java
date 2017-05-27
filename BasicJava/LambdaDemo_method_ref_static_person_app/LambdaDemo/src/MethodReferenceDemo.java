/**
 * 
 * We have defined a functional interface person and referring a
 * static method personWalking() to it's functional method walk().
 *
 */

@FunctionalInterface
interface Person
{
	void walk();
}

public class MethodReferenceDemo
{
	public static void personWalking()
	{
		System.out.println("Walking on the road.");
	}

	public static void main(String[] args)
	{
		// Referring static method
		Person person = MethodReferenceDemo::personWalking;
		// Calling interface method
		person.walk();
	}
}