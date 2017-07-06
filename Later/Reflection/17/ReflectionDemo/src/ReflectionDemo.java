import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;
import java.util.HashSet;

/**
 * 
 * We can read what parameters a given constructor can takes. 
 *
 */
public class ReflectionDemo
{
	public static void main(String[] args)
	{

		Class<HashSet> classObj = HashSet.class;

		/*
		 * Returns:the array of Constructor objects representing the public
		 * constructors of this class
		 */

		Constructor[] constructorArray= classObj.getConstructors();

		for (Constructor constructor : constructorArray)
		{
			System.out.println("constructor = "+constructor);
			System.out.println("Parameter Count = "+constructor.getParameterCount());
			/*
			 * Returns:an array of Parameter objects representing all the
			 * parameters to the executable this object represents.
			 */
			Parameter[] parameterArray = constructor.getParameters();
			for (Parameter parameter : parameterArray)
			{
				System.out.println("Parameter Type = "+parameter.getParameterizedType());
				System.out.println("Parameter Name = "+parameter.getName());
			}
			System.out.println("--------------------------------");
		}

	}

}