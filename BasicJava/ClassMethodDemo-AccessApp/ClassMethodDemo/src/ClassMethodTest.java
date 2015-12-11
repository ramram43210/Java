public class ClassMethodTest
{
	int instanceVar = 10;
	static String staticVar = "Welcome";

	public void instanceMethod1()
	{
		System.out.println("instanceMethod1 is called.");
	}


	/*
	 * Class methods can access class variables and class methods directly.
	 * 
	 * Class methods cannot access instance variables or instance methods
	 * directly—they must use an object reference.  Also, class methods cannot
	 * use the this keyword as there is no instance for this to refer to.
	 */

	public static void staticMethod()
	{
		System.out.println("staticMethod is called.");

		System.out.println("staticVar : " + staticVar);
		staticMethod();

		System.out.println("instanceVar : " + instanceVar);
		instanceMethod1();

		System.out.println(this.instanceVar);
		
		ClassMethodTest classMethodTest = new ClassMethodTest();
		
		System.out.println("instanceVar : " + classMethodTest.instanceVar);
		classMethodTest.instanceMethod1();		

	}

}
