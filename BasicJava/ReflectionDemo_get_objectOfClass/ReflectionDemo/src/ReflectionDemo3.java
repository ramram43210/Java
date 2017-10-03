import com.Student;

public class ReflectionDemo3
{
	public static void main(String[] args)
	{
		/*
		 * If a type is available but there is no instance then it is possible
		 * to obtain a Class by appending ".class" to the name of the type.It
		 * can be used for primitive data type also.
		 */
		Class<Student> studentClassObj = Student.class;
		System.out.println(studentClassObj.getName());

		Class<Integer> intClassObj = int.class;
		System.out.println(intClassObj.getName());
	}

}