import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 Method: 

 public static <T> int binarySearch(List<? extends T> list,
										 T key,
										 Comparator<? super T> c)

 Parameters:

 list - the list to be searched.
 key - the key to be searched for.
 c - the comparator by which the list is ordered. 
 	 A null value indicates that the elements' natural ordering should be used.

 Returns:
 
 the index of the search key, if it is contained in the list; otherwise, (-(insertion point) - 1). 
 The insertion point is defined as the point at which the key would be inserted into the list: 
 the index of the first element greater than the key, or list.size() 
 if all elements in the list are less than the specified key. 
 Note that this guarantees that the return value will be >= 0 if and only if the key is found.

 */

public class CollectionsExample
{

	public static void main(String[] args)
	{

		List<Employee> employeeList = new ArrayList<Employee>();

		Employee john = new Employee(300, "John");
		Employee david = new Employee(103, "David");
		Employee peter = new Employee(208, "Peter");
		Employee juli = new Employee(202, "Juli");
		Employee ram = new Employee(102, "Ram");

		employeeList.add(john);
		employeeList.add(david);
		employeeList.add(peter);
		employeeList.add(juli);
		employeeList.add(ram);

		System.out.println("employeeList before sort: \n" + employeeList + "\n");

		EmployeeIdComparator employeeIdComparator = new EmployeeIdComparator();

		Collections.sort(employeeList, employeeIdComparator);

		System.out
				.println("employeeList after sort : \n" + employeeList + "\n");

		/*
		 * Searches the specified list for the specified object using the binary
		 * search algorithm. The list must be sorted into ascending order
		 * according to the specified comparator (as by the sort(List,
		 * Comparator) method), prior to making this call.
		 * 
		 * If it is not sorted,the results are undefined. If the list contains
		 * multiple elements equal to the specified object, there is no
		 * guarantee which one will be found.
		 */
		
		Employee searchKey = new Employee(202, null); 
		
		int index = Collections.binarySearch(employeeList,
				searchKey, employeeIdComparator);

		System.out.println("index : " + index);
		
		Employee employee = employeeList.get(index);		
		System.out.println("employee name in  '"+index+"' index Position : "
				+ employee.getName());

	}
}
