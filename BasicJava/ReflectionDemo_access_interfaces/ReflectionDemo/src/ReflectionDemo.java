import java.util.ArrayList;

/**
 * 
 * It is possible to get a list of the interfaces implemented by a given class
 *
 */
public class ReflectionDemo
{
	public static void main(String[] args)
	{

		Class<ArrayList> classObj = ArrayList.class;

		/*
		 * Returns:an array of interfaces implemented by this class.
		 * 
		 * A class can implement many interfaces. Therefore an array of Class is
		 * returned. Interfaces are also represented by Class objects in Java
		 * Reflection.
		 */

		Class[] classArray = classObj.getInterfaces();

		for (Class class1 : classArray)
		{
			System.out.println(class1.getName());
		}

	}

}