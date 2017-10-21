import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * We can access the generic parameter types of the method parameters
 */
public class ReflectionDemo
{
	public static void main(String[] args)
	{
		try
		{
			Class<Display> classObj = Display.class;
			Method method = classObj.getMethod("setNameList", List.class);
			Type[] genericParameterTypes = method.getGenericParameterTypes();

			for (Type genericParameterType : genericParameterTypes)
			{
				System.out.println("genericParameterType = "+genericParameterType);
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