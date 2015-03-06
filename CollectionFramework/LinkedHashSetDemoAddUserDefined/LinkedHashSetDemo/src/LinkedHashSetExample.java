import java.util.LinkedHashSet;

/*
 * Storing user-defined class objects.
 */
public class LinkedHashSetExample
{
	public static void main(String[] args)
	{
		LinkedHashSet<Employee> linkedHashSet = new LinkedHashSet<Employee>();

		Employee john = new Employee("John", 32, 40000);
		Employee david = new Employee("David", 42, 80000);
		Employee peter = new Employee("Peter", 52, 150000);

		linkedHashSet.add(john);
		linkedHashSet.add(david);
		linkedHashSet.add(peter);

		System.out.println("linkedHashSet : " + linkedHashSet + "\n");

		/*
		 * Using for each loop getting each employee object from the
		 * linkedHashSet
		 */
		for (Employee employee : linkedHashSet)
		{
			System.out.println("-------------------------------------");
			System.out.println(employee.toString());
			System.out.println("Name : " + employee.getName());
			System.out.println("Age : " + employee.getAge());
			System.out.println("Salary : " + employee.getSalary());
		}

	}
}
