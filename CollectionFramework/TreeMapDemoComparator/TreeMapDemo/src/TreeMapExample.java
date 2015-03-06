import java.util.Comparator;
import java.util.TreeMap;

/*
 * Example of comparator() method.
 */
public class TreeMapExample
{
	public static void main( String[] args )
	{

		DescendingEmployeeIdComparator descendingEmployeeIdComparator = new DescendingEmployeeIdComparator();

		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>(
				descendingEmployeeIdComparator);
		/*
		 * Key is EmployeeId - Value is EmployeeName
		 */

		treeMap.put(20, "Balu");
		treeMap.put(10, "Ajay");
		treeMap.put(40, "Carol");
		treeMap.put(30, "Dave");

		System.out.println("treeMap : " + treeMap + "\n");
		
		Comparator<?> comparator = treeMap.comparator();
		
		System.out.println("Comparator name : "+comparator.getClass().getName());

	}
}
