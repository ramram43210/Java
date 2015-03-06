import java.util.Map;
import java.util.Set;
import java.util.LinkedHashMap;

/*
 * Example of adding User defined Object.
 */
public class LinkedHashMapExample
{
	public static void main(String[] args)
	{

		LinkedHashMap<Integer, Employee> linkedHashMap = new LinkedHashMap<Integer, Employee>();

		Employee john = new Employee("John", 32, 40000);
		Employee david = new Employee("David", 42, 80000);
		Employee peter = new Employee("Peter", 52, 150000);

		/*
		 * Key is EmpId - Value is Employee Object
		 */

		linkedHashMap.put(20, john);
		linkedHashMap.put(10, david);
		linkedHashMap.put(40, peter);

		System.out.println("linkedHashMap : " + linkedHashMap + "\n");

		Set<Map.Entry<Integer, Employee>> set = linkedHashMap.entrySet();

		System.out.println("set : " + set + "\n");

		System.out.println("-----------------------");
		System.out.println("Key" + " | " + "value");
		System.out.println("-----------------------");

		for (Map.Entry<Integer, Employee> entry : set)
		{
			int empId = entry.getKey();
			Employee employee = entry.getValue();
			System.out.println(empId + "   | " + employee);
		}

	}
}
