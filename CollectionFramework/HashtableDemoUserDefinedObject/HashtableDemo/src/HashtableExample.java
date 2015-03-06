import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/*
 * Example of adding User defined Object.
 */
public class HashtableExample
{
	public static void main( String[] args )
	{

		Hashtable<Integer, Employee> hashtable = new Hashtable<Integer, Employee>();

		/*
		 * Key is EmployeeId - Value is Employee Object
		 */

		Employee john = new Employee("John", 32, 40000);
		Employee david = new Employee("David", 42, 80000);
		Employee peter = new Employee("Peter", 52, 150000);

		hashtable.put(20, john);
		hashtable.put(10, david);
		hashtable.put(40, peter);

		System.out.println("hashtable : " + hashtable + "\n");

		Set<Map.Entry<Integer, Employee>> set = hashtable.entrySet();

		System.out.println("set : " + set + "\n");

		System.out.println("-----------------------");
		System.out.println("Key" + "  | " + "value");
		System.out.println("-----------------------");

		for( Map.Entry<Integer, Employee> entry : set )
		{
			int employeeId = entry.getKey();
			Employee employee = entry.getValue();
			System.out.println(employeeId + "   | " + employee);
		}


	}
}
