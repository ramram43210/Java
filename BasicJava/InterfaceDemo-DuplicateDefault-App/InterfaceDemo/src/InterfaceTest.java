public class InterfaceTest
{

	public static void main(String[] args)
	{
		InterfaceA interfaceARef = new MyClass();
		interfaceARef.sayHello();
		
		System.out.println("----------------------");
		
		InterfaceB interfaceBRef = new MyClass();
		interfaceBRef.sayHello();
		
	}

}
