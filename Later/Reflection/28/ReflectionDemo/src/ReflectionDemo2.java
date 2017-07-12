import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * We can access the annotations of a class, method or field at runtime.
 */
public class ReflectionDemo2
{
	public static void main(String[] args)
	{
		Class<Display> classObj = Display.class;

		try
		{
			Method method = classObj.getMethod("doSomething", null);
			/*
			 * Returns:this element's annotation for the specified annotation
			 * type if present on this element, else null
			 */
			Annotation annotation = method.getAnnotation(MyAnnotation.class);

			if (annotation instanceof MyAnnotation)
			{
				MyAnnotation myAnnotation = (MyAnnotation) annotation;
				System.out.println("name: " + myAnnotation.name());
				System.out.println("value: " + myAnnotation.value());
			}
		}
		catch (NoSuchMethodException | SecurityException e)
		{
			e.printStackTrace();
		}

	}

}