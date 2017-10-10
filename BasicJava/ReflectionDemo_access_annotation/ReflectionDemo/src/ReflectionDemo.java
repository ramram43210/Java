import java.lang.annotation.Annotation;

/**
 * 
 * We can access the class annotations of a class.
 *
 */
public class ReflectionDemo
{
	public static void main(String[] args)
	{

		Class<Display> classObj = Display.class;

		/*
		 * Returns:annotations present on this element.
		 */

		Annotation[] annotationArray = classObj.getAnnotations();

		for (Annotation annotation : annotationArray)
		{
			System.out.println(annotation);
		}

	}

}