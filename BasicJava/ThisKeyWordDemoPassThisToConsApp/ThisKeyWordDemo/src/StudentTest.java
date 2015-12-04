public class StudentTest
{

	public static void main(String[] args)
	{

		Address addressObject = new Address("India","Bangalore");
		Student student = addressObject.getStudentWithAddress("Peter", 27);
		System.out.println("Name : "+student.getName());
		System.out.println("Age  : "+student.getAge());

		System.out.println("Country : "+student.getAddress().getCountry());
		System.out.println("City    : "+student.getAddress().getCity());
	}

}
