import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee>
{

	/*
	 * This method is used to arrange the employee objects in Ascending order based
	 * on employee name.
	 */
	@Override
	public int compare( Employee employee1, Employee employee2 )
	{

		System.out
		        .println("\nCompare method has been called in EmployeeNameComparator,\nto arrange the"
		                + " employee objects in Ascending order based on employee name : ");

		System.out.println("employee1 = " + employee1 + ", employee2 = "
		        + employee2 + "\n");

		return employee1.getName().compareTo(employee2.getName());

	}

}
