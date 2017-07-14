import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Generic Field Types:It is possible to access the generic types of public
 * fields.
 * 
 */
public class ReflectionDemo
{
	public static void main(String[] args)
	{
		try
		{
			Field field = Display.class.getField("nameList");
			Type genericFieldType = field.getGenericType();

			if (genericFieldType instanceof ParameterizedType)
			{
				ParameterizedType aType = (ParameterizedType) genericFieldType;
				Type[] fieldArgTypes = aType.getActualTypeArguments();
				for (Type fieldArgType : fieldArgTypes)
				{
					Class fieldArgClass = (Class) fieldArgType;
					System.out.println("fieldArgClass = " + fieldArgClass);
					System.out.println(
							"fieldArgClass Name = " + fieldArgClass.getName());
				}
			}

		}
		catch (NoSuchFieldException | SecurityException e)
		{
			e.printStackTrace();
		}

	}

}