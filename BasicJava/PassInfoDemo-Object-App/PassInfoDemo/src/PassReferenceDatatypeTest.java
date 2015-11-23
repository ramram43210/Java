public class PassReferenceDatatypeTest
{

	public static void main(String[] args)
	{

		Employee employeeObject = new Employee();

		System.out.println("Before calling changeIt method ");

		System.out.println("Name : " + employeeObject.getName());
		System.out.println("Age : " + employeeObject.getAge());

		System.out.println("-------------------------- ");

		changeIt(employeeObject);

		System.out.println("After calling changeIt method ");

		System.out.println("Name : " + employeeObject.getName());
		System.out.println("Age : " + employeeObject.getAge());

	}

	/*
	 * Passing Reference Data Type Arguments :
	 * 
	 * Reference data type parameters, such as objects, are also passed into
	 * methods by value. This means that when the method returns, the passed-in
	 * reference still references the same object as before. However, the values
	 * of the object's fields can be changed in the method, if they have the
	 * proper access level.
	 */

	public static void changeIt(Employee employeeObject)
	{
		employeeObject.setName("Sawyer");
		employeeObject.setAge(29);
	}

}
