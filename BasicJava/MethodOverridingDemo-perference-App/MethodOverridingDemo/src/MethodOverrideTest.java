public class MethodOverrideTest
{

	public static void main(String[] args)
	{
		MyClass myClassObj = new MyClass();
		/*
		 * Default methods and abstract methods in interfaces are inherited like
		 * instance methods.
		 * 
		 * Instance methods are preferred over interface default methods.
		 */
		myClassObj.sayWelcome();
	}

}
