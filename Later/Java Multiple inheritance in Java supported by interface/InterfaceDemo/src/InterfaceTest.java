public class InterfaceTest
{

	public static void main(String[] args)
	{
		InterfaceA interfaceARef = new MyClass();
		interfaceARef.sayHi();
		
		InterfaceB interfaceBRef = new MyClass();
		interfaceBRef.sayHi();
		
	}

}
