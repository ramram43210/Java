import java.lang.reflect.Method;

/**
 * 
 * Java Reflection - Getters and Setters.
 *
 */
public class ReflectionDemo
{
	public static void main(String[] args)
	{
		Class<Student> classObj = Student.class;
		Method[] methodArray = classObj.getMethods();
		for (Method method : methodArray)
		{
			if (isGetter(method))
				System.out.println("getter: " + method);
			if (isSetter(method))
				System.out.println("setter: " + method);
		}
	}

	/**
	 * Getter: A getter method have its name start with "get", take 0
	 * parameters, and returns a value.
	 */
	public static boolean isGetter(Method method)
	{
		if (!method.getName().startsWith("get"))
		{
			return false;
		}
		if (method.getParameterTypes().length != 0)
		{
			return false;
		}
		if (void.class.equals(method.getReturnType()))
		{
			return false;
		}
		return true;
	}

	/**
	 * Setter: A setter method have its name start with "set", and
	 * takes 1 parameter.
	 */
	public static boolean isSetter(Method method)
	{
		if (!method.getName().startsWith("set"))
		{
			return false;
		}
		if (method.getParameterTypes().length != 1)
		{
			return false;
		}
		return true;
	}

}