
public class MyClass implements InterfaceA,InterfaceB
{

	public void sayHello()
	{
		InterfaceA.super.sayHello();
	}
}
