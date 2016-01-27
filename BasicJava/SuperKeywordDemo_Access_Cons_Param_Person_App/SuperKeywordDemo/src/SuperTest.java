public class SuperTest
{

	public static void main(String[] args)
	{
		Student studentObj = new Student("Peter",12,"Baldwin School");
		
		System.out.println("name = "+studentObj.getName());
		System.out.println("age  = "+studentObj.getAge());
		System.out.println("school name = "+studentObj.getSchoolName());
		
	}
}
