import java.lang.annotation.Annotation;

/**
 * We can access the annotations of a class, method or field at
 * runtime. 
 * 
 * Class Annotations Example:
 */
public class ReflectionDemo1
{
	public static void main(String[] args)
	{
		Class<Display> classObj = Display.class;
		/*
		 * Returns:annotations present on this element
		 */
		Annotation[] annotationArray = classObj.getAnnotations();

		for (Annotation annotation : annotationArray)
		{
			if (annotation instanceof MyAnnotation)
			{
				MyAnnotation myAnnotation = (MyAnnotation) annotation;
				System.out.println("name: " + myAnnotation.name());
				System.out.println("value: " + myAnnotation.value());
			}
		}
	}

}