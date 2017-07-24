import java.lang.reflect.Method;

public class ReflectionDemo3
{
	public static void main(String[] args)
	{
		try
		{
			Class<?> classObj = Class.forName("Student");

			/*
			 * getMethods() method returns array of Method object that reflect
			 * all the public method of invoking object.
			 */
			Method[] methodArray = classObj.getMethods();
			for (int i = 0; i < methodArray.length; i++)
			{
				System.out.println(methodArray[i]);
			}

			System.out.println("---------------------------------");

			/*
			 * getDeclaredMethods() returns only the declared methods of the
			 * invoking class object.
			 */
			Method[] declaredMethodArray = classObj.getDeclaredMethods();
			for (Method method : declaredMethodArray)
			{
				System.out.println(method);
			}
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
