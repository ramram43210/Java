public class RelationshipDemo
{

	public static void main(String[] args)
	{

		Address peterAddress = new Address("13th Cross", "Bangalore",
				"Karnataka", "560001");

		Employee peter = new Employee("Peter", 33, "Income Tax Department",
				350, peterAddress);
		
		System.out.println("Employee Peter Details : ");
		System.out.println(peter);
		
		System.out.println("----------------------------------------------");
		
		Address johnAddress = new Address("17th Cross", "Chennai",
				"TamilNadu", "600100");

		Student john = new Student("John", 33, 3.5,
				2, johnAddress);
		
		System.out.println("Student john Details : ");
		System.out.println(john);


	}
}
