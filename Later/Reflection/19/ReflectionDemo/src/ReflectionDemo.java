import java.lang.reflect.Field;

/**
 * 
 * Getting and Setting Field Values.
 *
 */
public class ReflectionDemo
{
	public static void main(String[] args)
	{
		try
		{
			Class<Student> classObj = Student.class;
			/*
			 * Returns:the Field object of this class specified by name
			 */
			Field field = classObj.getField("age");
			System.out.println("Field Name = " + field.getName());
			System.out.println("Field Type = " + field.getType());

			Student student = new Student();
			/*
			 * Sets the field represented by this Field object on the specified
			 * object argument to the specified new value.
			 */
			field.set(student, 23);
			Object ageValue = field.get(student);
			System.out.println("age =  "+ageValue);

		}
		catch (NoSuchFieldException | SecurityException
				| IllegalArgumentException | IllegalAccessException e)
		{
			e.printStackTrace();
		}
	}

}