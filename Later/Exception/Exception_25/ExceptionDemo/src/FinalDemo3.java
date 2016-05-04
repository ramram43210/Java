/*
 * If a class is marked as final then this class 
 * cannot be inherited by any other class.
 */

final class SuperClass
{
	void methodOfSuperClass()
	{
		System.out.println("final class");
	}
}

class SubClass extends SuperClass
{
	
}

public class FinalDemo3
{
	public static void main(String[] args)
	{
		SuperClass superClass = new SubClass();
		superClass.methodOfSuperClass();
	}

}