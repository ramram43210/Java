import java.lang.reflect.Field;

public class ReflectionDemo4
{
	public static void main(String[] args)
	{
		try
		{
			Class<?> classObj = Class.forName("Student");

			/*
			 * getFields() returns an array containing Field objects reflecting
			 * all the accessible public members of the class or interface
			 * represented by this Class object.
			 */
			Field[] fieldArray = classObj.getFields();
			for (Field field : fieldArray)
			{
				System.out.println(field);
			}

			System.out.println("-------------------------------");

			/*
			 * getDeclaredFields() returns array of Field objects reflecting all
			 * the fields declared by the class or interface represented by this
			 * Class object.
			 */
			Field[] declaredFieldArray = classObj.getDeclaredFields();
			for (Field field : declaredFieldArray)
			{
				System.out.println(field);
			}

		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
