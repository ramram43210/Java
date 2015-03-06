import java.util.TreeMap;

/*
 * Example of TreeMap(Comparator<? super K> comparator) Constructor.
 */
public class TreeMapExample
{
	public static void main(String[] args)
	{

		DescendingEmpIoyeeIdComparator descendingEmpIoyeeIdComparator = new DescendingEmpIoyeeIdComparator();

		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>(
				descendingEmpIoyeeIdComparator);
		/*
		 * Key is EmployeeId - Value is EmployeeName
		 */

		System.out.println("Key:20,Value:Balu is going to be add in treeMap");
		treeMap.put(20, "Balu");

		System.out.println("Key:10,Value:Ajay is going to be add in treeMap");
		treeMap.put(10, "Ajay");

		System.out.println("Key:40,Value:Carol is going to be add in treeMap");
		treeMap.put(40, "Carol");

		System.out.println("Key:30,Value:Dave is going to be add in treeMap");
		treeMap.put(30, "Dave");

		System.out.println("treeMap : " + treeMap + "\n");

	}
}
