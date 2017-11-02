import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * We can access the annotations of a class,method or field at runtime.
 * 
 * Method Annotations Example:
 */
public class ReflectionDemo1
{
	public static void main(String[] args)
	{
		try
		{
			Class<Display> classObj = Display.class;
			Method method = classObj.getMethod("doSomething", null);
			/*
			 * Returns:annotations present on this element			 * 
			 */
			Annotation[] annotationArray = method.getAnnotations();
			
			for (Annotation annotation : annotationArray)
			{
				if(annotation instanceof MyAnnotation)
				{
					MyAnnotation myAnnotation = (MyAnnotation)annotation;
					System.out.println("name: "+myAnnotation.name());
					System.out.println("value: "+myAnnotation.value());
				}
			}
		}
		catch (NoSuchMethodException | SecurityException e)
		{
			e.printStackTrace();
		}
	}

}