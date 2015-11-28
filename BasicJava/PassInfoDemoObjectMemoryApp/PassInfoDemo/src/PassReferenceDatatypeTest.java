public class PassReferenceDatatypeTest
{

	public static void main(String[] args)
	{

		Employee myEmployee = new Employee();

		System.out.println("Inside main before calling changeIt method: "
				+ myEmployee);

		System.out.println("Name : " + myEmployee.getName());
		System.out.println("Age  : " + myEmployee.getAge());

		System.out.println("-------------------------- ");

		changeIt(myEmployee);

		System.out.println("Inside main after calling changeIt method: "
				+ myEmployee);

		System.out.println("Name : " + myEmployee.getName());
		System.out.println("Age  : " + myEmployee.getAge());

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

	public static void changeIt(Employee employee)
	{
		employee.setName("Sawyer");
		employee.setAge(29);

		System.out.println("Inside changeIt method before assigning "
				+ "new Employee object to employeeObject reference: "
				+ employee);
		System.out.println("Name : " + employee.getName());
		System.out.println("Age  : " + employee.getAge());

		System.out.println("-------------------------- ");

		/*
		 * Inside the method, employee initially refers to myEmployee. The method
		 * changes the name and age properties of the object that employee references
		 * (i.e., myEmploye) by "Sawyer" and 29, respectively. These changes will
		 * persist when the method returns. Then employee is assigned a reference
		 * to a new Employee object with name = null and age = 0.
		 * 
		 * This reassignment has no permanence, however, because the reference
		 * was passed in by value and cannot change. Within the method, the
		 * object pointed to by employee has changed, but, when the method
		 * returns, myEmployee still references the same Employee object as
		 * before the method was called.
		 */
		employee = new Employee();
		System.out.println("Inside changeIt method after assigning "
				+ "new Employee object to employeeObject reference: "
				+ employee);
		System.out.println("Name : " + employee.getName());
		System.out.println("Age  : " + employee.getAge());

		System.out.println("-------------------------- ");

	}

}
