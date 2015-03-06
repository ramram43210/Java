import java.util.Vector;
/*
 * Storing user-defined class objects.
 */
public class VectorExample
{
	public static void main( String[] args )
	{
		Vector<Employee> vector = new Vector<Employee>();
		
		Employee john = new Employee("John", 32, 40000);
		Employee david = new Employee("David", 42, 80000);
		Employee peter = new Employee("Peter", 52, 150000);


		vector.add(john);
		vector.add(david);
		vector.add(peter);
		

		System.out.println("vector  : " + vector);
		System.out.println("----------------------------------------\n");
		
		/*
		 * Using for each loop getting each employee object from the vector
		 */
		for( Employee employee : vector )
		{
			System.out.println("Name : "+employee.getName());
			System.out.println("Age :"+employee.getAge());
			System.out.println("Salary :"+employee.getSalary());
			System.out.println("----------------------------------------");
		}


	}
}
