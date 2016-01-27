public class SubClass extends SuperClass
{

	public SubClass(String name)
	{
		super(name);
		System.out.println("Inside SubClass(String name) constructor. ");
	}
	
	public SubClass(String name,int age)
	{
		super(name,age);
		System.out.println("Inside SubClass(String name,int age) constructor. ");
	}

}
