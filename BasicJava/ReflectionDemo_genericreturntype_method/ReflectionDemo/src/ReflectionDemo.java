import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * How to get Generic return Type of the method
 */
public class ReflectionDemo
{
	public static void main(String[] args)
	{
		try
		{
			Class<Display> classObj = Display.class;
			Method method = classObj.getMethod("getNameList", null);
			Type type = method.getGenericReturnType();
			System.out.println("type = "+type);

			if (type instanceof ParameterizedType)
			{
				ParameterizedType parameterizedType = (ParameterizedType) type;
				Type[] typeArguments = parameterizedType.getActualTypeArguments();
				for (Type typeArgument : typeArguments)
				{
					Class typeArgClass = (Class) typeArgument;
					System.out.println("typeArgClass = " + typeArgClass);
					System.out.println("typeArgClass Name = " + typeArgClass.getName());
				}
			}
		}
		catch (NoSuchMethodException | SecurityException e)
		{
			e.printStackTrace();
		}

	}

}