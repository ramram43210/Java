import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 
 * Invoking Methods using Method Object.
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
			method.invoke(classObj.newInstance(), "hi");

		}
		catch (SecurityException | IllegalArgumentException
				| NoSuchMethodException | IllegalAccessException
				| InvocationTargetException | InstantiationException e)
		{
			e.printStackTrace();
		}
	}

}