public class StudentTest
{

	public static void main(String[] args) throws InterruptedException
	{
		Student student1 = new Student();
		System.out.println("name : " + student1.name);
		System.out.println("age  : " + student1.age);
		
		System.out.println("-----------------------------");
		
		Student student2 = new Student("John");
		System.out.println("name : " + student2.name);
		System.out.println("age  : " + student2.age);

	}

}
