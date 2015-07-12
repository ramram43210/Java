import java.util.ArrayList;
import java.util.Collections;

/*
 Method: 

 public static <T> T min(Collection<? extends T> coll,
                                       Comparator<? super T> comp)

 Parameters:

 coll - the collection whose minimum element is to be determined.
 comp - the comparator with which to determine the minimum element. 
        A null value indicates that the elements' natural ordering 
        should be used.

 Returns:

 the minimum element of the given collection, according to the specified comparator.

 */

public class CollectionsExample
{

	public static void main(String[] args)
	{

		ArrayList<Employee> employeeList = new ArrayList<Employee>();

		Employee john = new Employee(3, "John");
		Employee david = new Employee(2, "David");
		Employee peter = new Employee(1, "Peter");
		Employee juli = new Employee(5, "Juli");
		Employee ram = new Employee(4, "Ram");

		employeeList.add(john);
		employeeList.add(david);
		employeeList.add(peter);
		employeeList.add(juli);
		employeeList.add(ram);

		System.out.println("employeeList : " + employeeList + "\n");

		EmployeeIdComparator employeeIdComparator = new EmployeeIdComparator();

		/*
		 * Returns the minimum element of the given collection, according to the
		 * order induced by the specified comparator.
		 */
		Employee employee = Collections.min(employeeList, employeeIdComparator);

		System.out.println("Min employee object : " + employee);

	}
}
