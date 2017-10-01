import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo
{
	public static void main(String[] args)
	{
		Student student = new Student("Peter", 25);

		/*
		 * Returns: The Class object that represents the runtime class
		 * of this object.
		 * 
		 */
		Class<? extends Student> studentClass = student.getClass();

		/*
		 * Returns: the array of Method objects representing the
		 * public methods of this class
		 */
		Method[] methodArray = studentClass.getMethods();

		for (Method method : methodArray)
		{
			System.out.println(method.getName());
		}

		System.out.println("----------------------------------");

		/*
		 * Returns:the array of Field objects representing all the
		 * declared fields of this class
		 */
		Field[] fieldArray = studentClass.getDeclaredFields();

		for (Field field : fieldArray)
		{
			System.out.println(field.getName());
		}

	}

}