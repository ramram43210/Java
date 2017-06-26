import java.lang.reflect.Method;

/**
 * How to call private method from another class in java?
 * 
 * We can call the private method from outside the class by changing the runtime
 * behaviour of the class.
 * 
 * By the help of "java.lang.Class" class and "java.lang.reflect.Method" class,
 * we can call private method from any other class.
 *
 */
public class ReflectionDemo
{
	public static void main(String[] args)
	{
		try
		{
			Class<?> classObj = Class.forName("Student");
			Object obj = classObj.newInstance();
			Method method = classObj.getDeclaredMethod("showStudentFullName", null);
			method.setAccessible(true);
			method.invoke(obj, null);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}

}