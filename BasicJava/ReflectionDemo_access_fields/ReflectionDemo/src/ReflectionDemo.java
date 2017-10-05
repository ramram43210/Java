import java.lang.reflect.Field;

/**
 *
 * We can access the fields (member variables) of a class.
 *
 */
public class ReflectionDemo
{
	public static void main(String[] args)
	{

		Class<Student> classObj = Student.class;

		/*
		 * Returns:the array of Field objects representing the public fields.
		 */

		Field[] fieldArray = classObj.getFields();

		for (Field field : fieldArray)
		{
			System.out.println(field);
			System.out.println(field.getName());
			System.out.println("---------------------------------");
		}

	}

}