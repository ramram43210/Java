public class ObjectClassTest
{

	public static void main(String[] args)
	{
		Employee employeeObj1 = new Employee();

		/*
		 * Returns a hash code value for the object, which
		 * is the object's memory address in hexadecimal.
		 */

		System.out.println("employeeObj1.hashCode() = "
				+ employeeObj1.hashCode());

		Employee employeeObj2 = new Employee();

		System.out.println("employeeObj2.hashCode() = "
				+ employeeObj2.hashCode());

	}

}
