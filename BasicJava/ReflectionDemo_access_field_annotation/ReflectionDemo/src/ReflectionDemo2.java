import java.lang.reflect.Field;

/**
 * Example of a field with annotations
 */
public class ReflectionDemo2
{
	public static void main(String[] args)
	{
		try
		{
			Class<Display> classObj = Display.class;
			Field field = classObj.getField("myField");
			MyAnnotation myAnnotation = field.getAnnotation(MyAnnotation.class);

			System.out.println("name: " + myAnnotation.name());
			System.out.println("value: " + myAnnotation.value());
		}
		catch (NoSuchFieldException | SecurityException e)
		{
			e.printStackTrace();
		}

	}

}