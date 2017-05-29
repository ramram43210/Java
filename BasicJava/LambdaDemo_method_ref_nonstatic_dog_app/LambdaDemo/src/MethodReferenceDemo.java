/**
 *
 * We have defined a functional interface Dog and referring a
 * non-static method dogEating() to it's functional method eat().
 *
 */

@FunctionalInterface
interface Dog
{
	void eat();
}

public class MethodReferenceDemo
{
	public void dogEating()
	{
		System.out.println("Dog is eating chicken.");
	}

	public static void main(String[] args)
	{
		// Creating object
		MethodReferenceDemo methodReferenceDemo = new MethodReferenceDemo();
		
		// Referring non-static method using reference
		Dog dog = methodReferenceDemo::dogEating;
		
		// Calling interface method
		dog.eat();
	}
}