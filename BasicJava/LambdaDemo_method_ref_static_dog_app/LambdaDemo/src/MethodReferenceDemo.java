/**
 *
 * We have defined a functional interface Dog and referring a
 * static method dogEating() to it's functional method eat().
 *
 */

@FunctionalInterface
interface Dog
{
	void eat();
}

public class MethodReferenceDemo
{
	public static void dogEating()
	{
		System.out.println("Dog is eating chicken.");
	}

	public static void main(String[] args)
	{
		// Referring static method
		Dog dog = MethodReferenceDemo::dogEating;
		// Calling interface method
		dog.eat();
	}
}