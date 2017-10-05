import java.util.ArrayList;

/**
 * 
 * From the Class object we can access the superclass of the class.
 *
 */
public class ReflectionDemo
{
	public static void main(String[] args)
	{

		Class<ArrayList> classObj = ArrayList.class;

		/*
		 * Returns:the superclass of the class represented by this object.
		 */

		Class<? super ArrayList> superClass = classObj.getSuperclass();

		System.out.println(superClass);
		System.out.println("Name = "+superClass.getName());
		System.out.println("Simple Name = "+superClass.getSimpleName());

	}

}