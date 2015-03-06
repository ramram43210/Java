import java.util.HashSet;

/*
 * Storing user-defined class objects.
 */
public class HashSetExample
{
	public static void main(String[] args)
	{
		HashSet<Employee> hashSet = new HashSet<Employee>();

		Employee john = new Employee("John", 32, 40000);
		Employee david = new Employee("David", 42, 80000);
		Employee peter = new Employee("Peter", 52, 150000);

		hashSet.add(john);
		hashSet.add(david);
		hashSet.add(peter);

		System.out.println("hashSet : " + hashSet + "\n");

		/*
		 * Using for each loop getting each employee object from the hashSet
		 */
		for (Employee employee : hashSet)
		{
			System.out.println("-------------------------------------");
			System.out.println(employee.toString());
			System.out.println("Name : " + employee.getName());
			System.out.println("Age : " + employee.getAge());
			System.out.println("Salary : " + employee.getSalary());
		}

	}
}
