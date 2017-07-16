import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * Example of a field with annotations
 */
public class ReflectionDemo1
{
	public static void main(String[] args)
	{
		try
		{
			Class<Display> classObj = Display.class;
			Field field = classObj.getField("myField");
			Annotation[] annotations = field.getDeclaredAnnotations();

			for (Annotation annotation : annotations)
			{
				if (annotation instanceof MyAnnotation)
				{
					MyAnnotation myAnnotation = (MyAnnotation) annotation;
					System.out.println("name: " + myAnnotation.name());
					System.out.println("value: " + myAnnotation.value());
				}
			}
		}
		catch (NoSuchFieldException | SecurityException e)
		{
			e.printStackTrace();
		}

	}

}