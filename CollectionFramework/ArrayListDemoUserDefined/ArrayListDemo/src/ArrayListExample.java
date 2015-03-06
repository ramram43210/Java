import java.util.ArrayList;
import java.util.List;

/*
 * Storing user-defined class objects.
 */
public class ArrayListExample
{

	public static void main(String[] args)
	{
		List<Employee> list = new ArrayList<Employee>();

		Employee john = new Employee("John", 32, 40000);
		Employee david = new Employee("David", 42, 80000);
		Employee peter = new Employee("Peter", 52, 150000);

		list.add(john);
		list.add(david);
		list.add(peter);

		/*
		 * Using for each loop getting each employee object from the list
		 */
		for (Employee employee : list)
		{
			System.out.println(employee.toString());
		}
	}
}
