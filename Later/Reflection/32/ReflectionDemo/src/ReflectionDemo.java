import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * How to get Generic Method Return Types
 */
public class ReflectionDemo
{
	public static void main(String[] args)
	{
		try
		{
			Method method = Display.class.getMethod("setNameList", List.class);
			Type[] genericParameterTypes = method.getGenericParameterTypes();

			for (Type genericParameterType : genericParameterTypes)
			{
				if (genericParameterType instanceof ParameterizedType)
				{
					ParameterizedType aType = (ParameterizedType) genericParameterType;
					Type[] parameterArgTypes = aType.getActualTypeArguments();
					for (Type parameterArgType : parameterArgTypes)
					{
						Class parameterArgClass = (Class) parameterArgType;
						System.out.println("parameterArgClass = " + parameterArgClass);
						System.out.println("parameterArgClass Name = " + parameterArgClass.getName());
					}
				}
			}
		}
		catch (NoSuchMethodException | SecurityException e)
		{
			e.printStackTrace();
		}

	}

}