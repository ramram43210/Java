import java.lang.reflect.Method;

/**
 * 
 * How to get method parameter count.
 *
 */
public class ReflectionDemo
{
	public static void main(String[] args)
	{
		Class<DisplayMessage> classObj = DisplayMessage.class;
		Method[] methodArray = classObj.getMethods();
		for (Method method : methodArray)
		{
			System.out.println(method);
			System.out.println("Parameter Count = "+method.getParameterCount());
			System.out.println("---------------------------");
		}
	}

}