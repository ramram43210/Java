public class MyClass implements InterfaceA, InterfaceB
{
	public void sayWelcome()
	{
		System.out.println("Welcome by MyClass,Calling "
				+ "super interfaces default methods");
		InterfaceA.super.sayWelcome();
		InterfaceB.super.sayWelcome();
	}
}
