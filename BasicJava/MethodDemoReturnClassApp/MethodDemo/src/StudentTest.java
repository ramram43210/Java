public class StudentTest
{

	public static void main(String[] args) throws InterruptedException
	{
		Student johnReferenceVariable = getStudent("John", 25);

		System.out.println("Name : " + johnReferenceVariable.getName());
		System.out.println("Age  : " + johnReferenceVariable.getAge());

		System.out.println("--------------------------------");

		Student peterReferenceVariable = getStudent("Peter", 55);

		System.out.println("Name : " + peterReferenceVariable.getName());
		System.out.println("Age  : " + peterReferenceVariable.getAge());

	}

	/*
	 * Returning a Class:
	 * 
	 * When a method uses a class name as its return type, the class of the type
	 * of the returned object must be either a subclass of, or the exact class
	 * of, the return type.
	 */
	public static Student getStudent(String name, int age)
	{
		Student student = new Student();
		student.setName(name);
		student.setAge(age);
		return student;
	}

}
