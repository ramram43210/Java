import java.util.Comparator;

public class EmployeeIdComparator implements Comparator<Employee>
{

	/*
	 * This method used to order the employee objects in Ascending based on employeeId.
	 */
	@Override
	public int compare(Employee employee1, Employee employee2)
	{

		return employee1.getEmployeeId().compareTo(employee2.getEmployeeId());

	}

}
