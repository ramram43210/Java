import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 
 * Instantiating Objects using Constructor Object.
 *
 */
public class ReflectionDemo
{
	public static void main(String[] args)
	{
		try
		{

			Class classObj = String.class;
			/*
			 * Parameters:
			 * 
			 * parameterTypes - the parameter array
			 * 
			 * Returns: the Constructor object of the public
			 * constructor that matches the specified parameterTypes
			 * 
			 */

			Constructor constructor = classObj.getConstructor(StringBuffer.class);
			StringBuffer sb = new StringBuffer("Peter");
			/*
			 * Returns:a new object created by calling the constructor
			 * this object represents
			 */
			String str = (String) constructor.newInstance(sb);
			System.out.println(str);
		}
		catch (NoSuchMethodException | SecurityException
				| InstantiationException | IllegalAccessException
				| IllegalArgumentException
				| InvocationTargetException e)
		{
			e.printStackTrace();
		}

	}

}