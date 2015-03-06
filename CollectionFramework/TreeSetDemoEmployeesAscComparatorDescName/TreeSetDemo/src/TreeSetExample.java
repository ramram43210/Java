import java.util.TreeSet;

/*
 * Example of  TreeSet(Comparator<? super E> comparator) Constructor.
 */
public class TreeSetExample
{
	public static void main(String[] args)
	{

		EmployeeNameComparator employeeNameComparator = new EmployeeNameComparator();

		/*
		 * Constructs a new, empty tree set, sorted according to the specified
		 * comparator.
		 * 
		 * All elements inserted into the set must be mutually comparable by the
		 * specified comparator: comparator.compare(e1, e2) must not throw a
		 * ClassCastException for any elements e1 and e2 in the set.
		 * 
		 * If the user attempts to add an element to the set that violates this
		 * constraint, the add call will throw a ClassCastException.
		 */

		TreeSet<Employee> treeSet = new TreeSet<Employee>(
				employeeNameComparator);

		Employee carol = new Employee(3, "Carol");
		Employee balu = new Employee(5, "Balu");
		Employee ajay = new Employee(4, "Ajay");
		Employee dave = new Employee(1, "Dave");

		System.out.println(carol + " is going to be add in treeSet");
		treeSet.add(carol);

		System.out.println(balu + " is going to be add in treeSet");
		treeSet.add(balu);

		System.out.println(ajay + " is going to be add in treeSet");
		treeSet.add(ajay);

		System.out.println(dave + " is going to be add in treeSet");
		treeSet.add(dave);

		System.out.println("treeSet : " + treeSet + "\n");

		for (Employee employee : treeSet)
		{
			System.out.println("Name : " + employee.getName());
			System.out.println("Employee ID : " + employee.getEmployeeId());
			System.out.println("-----------------------------------");
		}

	}
}
