import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Parameter Annotations:
 * 
 * We can access parameter annotations from the Method object like below.
 */
public class ReflectionDemo
{
	public static void main(String[] args)
	{
		try
		{
			Class<Display> classObj = Display.class;
			Method method = classObj.getMethod("doSomething", String.class);
			/*
			 * Returns:a two-dimensional Annotation array, containing an 
			 * array of annotations for each method parameter.
			 */
			Annotation[][] parameterAnnotations = method.getParameterAnnotations();
			Class[] parameterTypes = method.getParameterTypes();

			int i = 0;
			for (Annotation[] annotations : parameterAnnotations)
			{
				Class parameterType = parameterTypes[i++];

				for (Annotation annotation : annotations)
				{
					if (annotation instanceof MyAnnotation)
					{
						MyAnnotation myAnnotation = (MyAnnotation) annotation;
						System.out.println("param: " + parameterType.getName());
						System.out.println("name : " + myAnnotation.name());
						System.out.println("value: " + myAnnotation.value());
					}
				}
			}
		}
		catch (NoSuchMethodException e)
		{
			e.printStackTrace();
		}
	}

}