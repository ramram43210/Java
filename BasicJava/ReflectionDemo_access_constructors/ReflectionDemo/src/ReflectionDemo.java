import java.lang.reflect.Constructor;
import java.util.ArrayList;

/**
 * 
 * We can access the constructors of a class.
 *
 */
public class ReflectionDemo
{
	public static void main(String[] args)
	{

		Class<ArrayList> classObj = ArrayList.class;

		/*
		 * Returns:the array of Constructor objects representing the public
		 * constructors of this class
		 */

		Constructor<?>[] constructorArray = classObj.getConstructors();

		for (Constructor constructor : constructorArray)
		{
			System.out.println(constructor);
			System.out.println("Name = "+constructor.getName());
			System.out.println("ParameterCount = "+constructor.getParameterCount());
			System.out.println("-----------------------------");
		}

	}

}