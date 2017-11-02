import java.lang.reflect.Method;

/**
 * We can access the annotations of a class,method or field at
 * runtime.
 * 
 * Method Annotations Example:
 */
public class ReflectionDemo2
{
	public static void main(String[] args)
	{
		try
		{
			Class<Display> classObj = Display.class;
			Method method = classObj.getMethod("doSomething", null);
			/*
			 * Returns: this element's annotation for the specified
			 * annotation type if present on this element, else null
			 * 
			 */
			MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);
			System.out.println("name: " + myAnnotation.name());
			System.out.println("value: " + myAnnotation.value());

		}
		catch (NoSuchMethodException | SecurityException e)
		{
			e.printStackTrace();
		}
	}

}