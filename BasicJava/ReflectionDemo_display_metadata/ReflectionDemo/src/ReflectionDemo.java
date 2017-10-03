import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * How to display the metadata of a class.
 *
 */
public class ReflectionDemo
{
	public static void main(String[] args)
	{

		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter the ClassName: ");
			String className= br.readLine();
			br.close();
			
			Class<?> classObj = Class.forName(className);
			System.out.println("Fields: ");

			/*
			 * Returns:the array of Field objects representing all the declared
			 * fields of this class
			 */
			Field[] fieldArray = classObj.getDeclaredFields();
			for (Field field : fieldArray)
			{
				System.out.println(field);
			}

			System.out.println("---------------------------------------");

			System.out.println("\nConstructors:");
			/*
			 * Returns:the array of Constructor objects representing all the
			 * declared constructors of this class
			 */
			Constructor<?>[] constructorArray = classObj.getDeclaredConstructors();
			for (Constructor<?> constructor : constructorArray)
			{
				System.out.println(constructor);
			}
			System.out.println("---------------------------------------");

			System.out.println("\nMethods:");
			/*
			 * Returns:the array of Method objects representing all the declared
			 * methods of this class
			 */
			Method[] methodArray = classObj.getDeclaredMethods();

			for (Method method : methodArray)
			{
				System.out.println(method);
			}
		}
		catch (ClassNotFoundException | IOException e)
		{
			e.printStackTrace();
		}

	}

}