import com.Student;

public class ReflectionDemo2
{
	public static void main(String[] args)
	{
		Student student = new Student("Peter", 25);

		/*
		 * Returns:The Class object that represents the runtime class of this
		 * object.
		 */
		Class<? extends Student> classObj = student.getClass();
		System.out.println(classObj.getName());

	}

}