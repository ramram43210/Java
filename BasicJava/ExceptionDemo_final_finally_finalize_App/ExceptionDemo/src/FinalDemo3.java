/*
 * If a class is marked as final then this class 
 * cannot be inherited by any other class.
 */

final class SuperClass1
{
	void methodOfSuperClass()
	{
		System.out.println("final class");
	}
}

class SubClass1 extends SuperClass1
{
	
}

public class FinalDemo3
{
	public static void main(String[] args)
	{
		SuperClass1 superClass1 = new SubClass1();
		superClass1.methodOfSuperClass();
	}

}