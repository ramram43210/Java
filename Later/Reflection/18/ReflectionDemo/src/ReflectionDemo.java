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
			Constructor constructor = String.class.getConstructor(StringBuffer.class);
			StringBuffer sb = new StringBuffer("Peter");
			/*
			 * Returns:a new object created by calling the constructor this
			 * object represents
			 */
			String str = (String) constructor.newInstance(sb);
			System.out.println(str);
		}
		catch (NoSuchMethodException | SecurityException
				| InstantiationException | IllegalAccessException
				| IllegalArgumentException | InvocationTargetException e)
		{
			e.printStackTrace();
		}

	}

}