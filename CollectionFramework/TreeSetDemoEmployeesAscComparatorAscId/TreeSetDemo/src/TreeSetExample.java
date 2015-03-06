import java.util.TreeSet;

/*
 * Example of  TreeSet(Comparator<? super E> comparator) Constructor.
 */
public class TreeSetExample
{
	public static void main( String[] args )
	{

		EmployeeIdComparator employeeIdComparator = new EmployeeIdComparator();

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

		TreeSet<Employee> treeSet = new TreeSet<Employee>(employeeIdComparator);

		Employee john = new Employee(3, "John");
		Employee david = new Employee(2, "David");
		Employee peter = new Employee(1, "Peter");
		Employee juli = new Employee(4, "Juli");
		

		System.out.println(john + " is going to be add in treeSet");
		treeSet.add(john);
		
		System.out.println(david + " is going to be add in treeSet");
		treeSet.add(david);
		
		System.out.println(peter + " is going to be add in treeSet");
		treeSet.add(peter);
		
		System.out.println(juli + " is going to be add in treeSet");
		treeSet.add(juli);
		
		System.out.println("treeSet : " + treeSet + "\n");
		
		for( Employee employee : treeSet )
        {
	        System.out.println("Employee ID : "+employee.getEmployeeId());
	        System.out.println("Name : "+employee.getName());
	        System.out.println("-----------------------------------");
        }

	}
}
