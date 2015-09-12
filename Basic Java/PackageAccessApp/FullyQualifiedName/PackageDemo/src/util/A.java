package util;

public class A
{

	public static void main(String[] args)
	{
		/*
		 * If you use fully qualified name then only declared class of this
		 * package will be accessible. Now there is no need to import. But you
		 * need to use fully qualified name every time when you are accessing
		 * the class or interface.
		 * 
		 * It is generally used when two packages have same class name e.g.
		 * java.util and java.sql packages contain Date class.
		 */
		mypack.A a = new mypack.A();
		a.message();
	}

}
