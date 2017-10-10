import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 
 * Invoking Static Method using Method Object.
 *
 */
public class ReflectionDemo
{
	public static void main(String[] args)
	{
		try
		{
			Class<DisplayMessage> classObj = DisplayMessage.class;
			
			Method method = classObj.getMethod("displayMessage",
											new Class[] { String.class });

			/*
			 * Invokes the underlying method represented by this Method object,
			 * on the specified object with the specified parameters.
			 */
			method.invoke(null, "hi");

		}
		catch (SecurityException | IllegalArgumentException
				| NoSuchMethodException | IllegalAccessException
				| InvocationTargetException e)
		{
			e.printStackTrace();
		}
	}

}