public class InheritanceExample
{
	public static void main(String[] args)
	{
		SoftwareEngineer softwareEngineer = new SoftwareEngineer();

		/*
		 * SoftwareEngineer object can access the field and methods of own class
		 * as well as of Employee class i.e. code reusability.
		 */

		System.out.println("Properties");
		System.out.println("-----------------");
		System.out.println("SoftwareEngineer salary is:"
				+ softwareEngineer.salary);

		System.out.println("Bonus of SoftwareEngineer is:"
				+ softwareEngineer.bonus);

		System.out.println("\nBehaviours");
		System.out.println("-----------------");
		softwareEngineer.run();
		softwareEngineer.walk();
		softwareEngineer.talkAboutJava();

	}

}
