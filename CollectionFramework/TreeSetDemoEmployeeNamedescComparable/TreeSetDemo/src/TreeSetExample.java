import java.util.TreeSet;

/*
 * Storing user-defined class objects.
 */
public class TreeSetExample
{
	public static void main( String[] args )
	{
		TreeSet<Employee> treeSet = new TreeSet<Employee>();

		Employee john = new Employee("Balu", 10, 40000);
		Employee david = new Employee("Ajay", 20, 80000);
		Employee peter = new Employee("Carol", 30, 150000);

		System.out.println(john + " is going to be add in treeSet");
		treeSet.add(john);
		
		System.out.println(david + " is going to be add in treeSet");
		treeSet.add(david);
		
		System.out.println(peter + " is going to be add in treeSet");
		treeSet.add(peter);
		

		System.out.println("treeSet : " + treeSet + "\n");
		System.out.println("--------------------------------------------");
		/*
		 * Using for each loop getting each employee object from the treeSet
		 */
		for( Employee employee : treeSet )
		{
			System.out.println("Employee Name : "+employee.getName());
			System.out.println("Employee Age : "+employee.getAge());
			System.out.println("Employee Salary :"+ employee.getSalary());
			System.out.println("--------------------------------------------");
		}

	}
}
