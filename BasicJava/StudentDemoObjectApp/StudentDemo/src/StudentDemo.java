public class StudentDemo
{
	public static void main(String[] args)
	{

		Student peter = new Student();

		/*
		 * Setting States/Attributes/Properties/Characteristics.
		 */
		peter.name = "Peter";
		peter.age = 3;
		peter.color = "white";
		peter.sex = "male";

		displayStudentInformation(peter);
		
		System.out.println("\nBehaviors");
		System.out.println("----------");
		
		peter.eating("can eat more foods");
		peter.drinking("can drink more water");
		peter.running("can run fast");
		
		System.out.println("*********************************************");
		
		Student john = new Student();

		/*
		 * Setting States/Attributes/Properties/Characteristics.
		 */
		john.name = "John";
		john.age = 4;
		john.color = "brown";
		john.sex = "male";

		displayStudentInformation(john);
		
		System.out.println("\nBehaviors");
		System.out.println("----------");
		
		john.eating("can eat less foods");
		john.drinking("can drink more water");
		john.running("can run slow");
		
		System.out.println("*********************************************");
		
		
		Student julia = new Student();

		/*
		 * Setting States/Attributes/Properties/Characteristics.
		 */
		julia.name = "Julia";
		julia.age = 2;
		julia.color = "white";
		julia.sex = "female";

		displayStudentInformation(julia);
		
		System.out.println("\nBehaviors");
		System.out.println("----------");
		
		julia.eating("can eat less foods");
		julia.drinking("can drink less water");
		julia.running("can run fast");
		
		System.out.println("*********************************************");
		

	}

	private static void displayStudentInformation(Student student)
	{
		System.out.println("Attributes");
		System.out.println("--------------");

		System.out.println("Name : " + student.name);
		System.out.println("Age : " + student.age);
		System.out.println("Color : " + student.color);
		System.out.println("sex : " + student.sex);

	}

}
