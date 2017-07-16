import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * How to get Generic Method Return Types
 */
public class ReflectionDemo
{
	public static void main(String[] args)
	{
		try
		{
			Method method = Display.class.getMethod("getNameList", null);
			Type returnType = method.getGenericReturnType();

			if (returnType instanceof ParameterizedType)
			{
				ParameterizedType type = (ParameterizedType) returnType;
				Type[] typeArguments = type.getActualTypeArguments();
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