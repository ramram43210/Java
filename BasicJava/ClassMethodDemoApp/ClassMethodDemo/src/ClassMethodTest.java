public class ClassMethodTest
{

	public static void main(String[] args)
	{
		ClassMethodTest.display("Hello");

		ClassMethodTest classMethodTest = new ClassMethodTest();

		/*
		 * You can also refer to static methods with an object reference like
		 * below. but this is discouraged because it does not make it clear that
		 * they are class methods.
		 */
		classMethodTest.display("Peter");
	}

	/*
	 * Static methods, which have the static modifier in their declarations,
	 * should be invoked with the class name, without the need for creating an
	 * instance of the class.
	 */
	public static void display(String str)
	{
		System.out.println(str);
	}

}
