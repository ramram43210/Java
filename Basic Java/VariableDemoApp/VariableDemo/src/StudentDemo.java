public class StudentDemo
{

	public static void main(String[] args)
	{
		Student studentObj = new Student();

		/*
		 * Access instance variable.
		 */
		studentObj.name = "John";		
		System.out.println("Name :" + studentObj.name); 

		/*
		 * Access static variable.
		 */
		
		System.out.println("School Code : " + Student.schoolCode);

		studentObj.eat();

	}

}
