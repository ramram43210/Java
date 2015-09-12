package util;

/**
 * If you import packagename.classname then only declared class of 
 * this package will be accessible.
 */
import mypack.A;

public class B
{

	public static void main(String[] args)
	{
		A a = new A();
		a.message();
	}

}
