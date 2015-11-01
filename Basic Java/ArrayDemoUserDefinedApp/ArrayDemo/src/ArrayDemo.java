class ArrayDemo
{
	public static void main(String[] args)
	{
		/*
		 * declares an array of Employee Objects and allocates memory for 5
		 * Employee Objects
		 */
		Employee[] employeeArray = new Employee[5];

		// initialize first element
		employeeArray[0] = new Employee("Peter", 23, 60000);
		// initialize second element
		employeeArray[1] = new Employee("John", 33, 66000);
		// and so forth
		employeeArray[2] = new Employee("Ram", 31, 90000);
		employeeArray[3] = new Employee("David", 24, 40000);
		employeeArray[4] = new Employee("Stephan", 45, 95000);

		int i = 0;
		for (Employee employee : employeeArray)
		{
			System.out.println("Element at index " + i + " : " + employee);
			++i;
		}

	}
}