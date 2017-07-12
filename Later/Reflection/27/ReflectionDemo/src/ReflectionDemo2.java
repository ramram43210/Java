import java.lang.annotation.Annotation;

/**
 * We can access the annotations of a class, method or field at runtime.
 Class Annotations Example:
 */
public class ReflectionDemo2
{
	public static void main(String[] args)
	{
		Class<Display> classObj = Display.class;
		/*
		 * Returns:this element's annotation for the specified annotation type
		 * if present on this element, else null
		 */
		Annotation annotation = classObj.getAnnotation(MyAnnotation.class);

		if (annotation instanceof MyAnnotation)
		{
			MyAnnotation myAnnotation = (MyAnnotation) annotation;
			System.out.println("name: " + myAnnotation.name());
			System.out.println("value: " + myAnnotation.value());
		}
	}

}