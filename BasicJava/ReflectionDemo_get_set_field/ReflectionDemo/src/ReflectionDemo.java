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
			Field ageField = classObj.getField("age");
			System.out.println("Field Name = " + ageField.getName());
			System.out.println("Field Type = " + ageField.getType());

			Student student = classObj.newInstance();
			/*
			 * Sets the field represented by this Field object on the specified
			 * object argument to the specified new value.
			 */
			ageField.set(student, 23);
			Object ageValue = ageField.get(student);
			System.out.println("age =  "+ageValue);
		}
		catch (NoSuchFieldException | SecurityException
				| IllegalArgumentException | IllegalAccessException
				| InstantiationException e)
		{
			e.printStackTrace();
		}
	}

}