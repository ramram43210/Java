public class StudentTest
{

	public static void main(String[] args)
	{

		Student studentObject = new Student("Peter",45);

		System.out.println("studentObject : " + studentObject);

		System.out.println("studentObject : "+studentObject.getStudent());
		
		System.out.println("Name : "+studentObject.getStudent().name);
		System.out.println("Age  : "+studentObject.getStudent().age);

	}

}
