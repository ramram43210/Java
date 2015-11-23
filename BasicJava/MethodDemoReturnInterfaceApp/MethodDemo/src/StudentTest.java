public class StudentTest
{

	public static void main(String[] args) throws InterruptedException
	{

		Person johnReferenceVariable = getPerson("John");

		johnReferenceVariable.walk();

		System.out.println("--------------------------------");

		Person peterReferenceVariable = getPerson("Peter");

		peterReferenceVariable.walk();

	}

	/*
	 * You also can use interface names as return types. In this case, the
	 * object returned must implement the specified interface.
	 */
	public static Person getPerson(String name)
	{
		Student student = new Student();
		student.setName(name);
		return student;
	}

}
