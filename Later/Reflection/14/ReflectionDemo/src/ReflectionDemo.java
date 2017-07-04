import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * 
 * We can access the methods of a class.
 *
 */
public class ReflectionDemo
{
	public static void main(String[] args)
	{

		Class<ArrayList> classObj = ArrayList.class;

		/*
		 * Returns:the array of Method objects representing the public methods
		 * of this class.
		 */

		Method[] methodArray = classObj.getMethods();

		for (Method method : methodArray)
		{
			System.out.println(method);
		}

	}

}