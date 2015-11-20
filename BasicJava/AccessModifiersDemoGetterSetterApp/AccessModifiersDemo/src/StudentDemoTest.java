public class StudentDemoTest
{

	public static void main(String[] args)
	{
		Student student = new Student();
		student.setName("Dave"); 
		student.setAge(23);
		
		System.out.println("Name : "+student.getName());
		System.out.println("Age  : "+student.getAge());
	}

}
