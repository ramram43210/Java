import java.util.Comparator;

public class EmployeeIdComparator implements Comparator<Employee>
{

	/*
	 * This method used to order the employee objects in Ascending based on employeeId.
	 */
	@Override
	public int compare(Employee employee1, Employee employee2)
	{

		if (employee1.getEmployeeId() < employee2.getEmployeeId())
		{
			return -1;
		}
		else
		{
			return 1;
		}

	}

}
