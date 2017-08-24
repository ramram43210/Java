import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * List of objects -> List of other objects
 * 
 * This example shows you how to convert a list of SoftwareEngineer
 * objects into a list of Employee objects.
 */
public class NonStreamDemo
{
	public static void main(String[] args)
	{

		List<SoftwareEngineer> softwareEngineerList = Arrays.asList(
				new SoftwareEngineer("Ram", 30),
				new SoftwareEngineer("Peter", 27),
				new SoftwareEngineer("Dave", 33));

		// Before java 8
		List<Employee> employeeList = convertToEmployee(softwareEngineerList);
		System.out.println(employeeList);
	}

	private static List<Employee> convertToEmployee(List<SoftwareEngineer> softwareEngineerList)
	{

		List<Employee> employeeList = new ArrayList<>();

		for (SoftwareEngineer softwareEngineer : softwareEngineerList)
		{
			Employee employee = new Employee();
			employee.setName(softwareEngineer.getName());
			employee.setAge(softwareEngineer.getAge());
			employeeList.add(employee);
		}

		return employeeList;

	}

}