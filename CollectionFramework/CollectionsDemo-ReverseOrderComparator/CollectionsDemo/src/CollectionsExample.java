import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 Method 

 public static <T> Comparator<T> reverseOrder(Comparator<T> cmp)

 Parameters:

 cmp - a comparator who's ordering is to be reversed by the returned comparator or null

 Returns:

 A comparator that imposes the reverse ordering of the specified comparator.

 */

public class CollectionsExample
{

	public static void main(String[] args)
	{

		List<Employee> employeeList = new ArrayList<Employee>();

		Employee john = new Employee(300, "John");
		Employee david = new Employee(100, "David");
		Employee peter = new Employee(200, "Peter");
		Employee juli = new Employee(500, "Juli");
		Employee ram = new Employee(400, "Ram");

		employeeList.add(john);
		employeeList.add(david);
		employeeList.add(peter);
		employeeList.add(juli);
		employeeList.add(ram);

		System.out.println("Before sort the employeeList : \n");
		displayEmployeeInfo(employeeList);

		AscEmployeeIdComparator ascEmployeeIdComparator = new AscEmployeeIdComparator();

		Collections.sort(employeeList, ascEmployeeIdComparator);

		System.out
				.println("\nAfter Sort the employeeList using ascEmployeeIdComparator : \n");
		displayEmployeeInfo(employeeList);

		/*
		 * Returns a comparator that imposes the reverse ordering of the
		 * specified comparator. If the specified comparator is null, this
		 * method is equivalent to reverseOrder() (in other words, it returns a
		 * comparator that imposes the reverse of the natural ordering on a
		 * collection of objects that implement the Comparable interface).
		 */

		Comparator<Employee> reverseEmployeeIdcomparator = Collections
				.reverseOrder(ascEmployeeIdComparator);

		// sort the list
		Collections.sort(employeeList, reverseEmployeeIdcomparator);

		System.out
				.println("\nAfter Sort the employeeList using reverseEmployeeIdcomparator : \n");
		displayEmployeeInfo(employeeList);

	}

	private static void displayEmployeeInfo(List<Employee> employeeList)
	{
		for (Employee employee : employeeList)
		{
			System.out.println("ID :" + employee.getEmployeeId() + " Name :"
					+ employee.getName());

		}
	}
}
