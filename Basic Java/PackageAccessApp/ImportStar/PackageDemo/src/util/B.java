package util;

/**
 * If you use packagename.* then all the classes and interfaces of this package
 * will be accessible but not sub packages.
 *
 * The import keyword is used to make the classes and interface of
 * another package accessible to the current package.
 */
import mypack.*;

public class B
{

	public static void main(String[] args)
	{
		A a = new A();
		a.message();
	}

}
