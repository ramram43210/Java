import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * List of objects -> List of other objects
 * 
 * This example shows you how to convert a list of SoftwareEngineer
 * objects into a list of Employee objects.
 */
public class StreamDemo
{
	public static void main(String[] args)
	{

		List<SoftwareEngineer> softwareEngineerList = Arrays.asList(
				new SoftwareEngineer("Ram", 30),
				new SoftwareEngineer("Peter", 27),
				new SoftwareEngineer("Dave", 33));

		// Java 8
		List<Employee> employeeList = softwareEngineerList.stream()
				.map(softwareEngineer -> {
					Employee employee = new Employee();
					employee.setName(softwareEngineer.getName());
					employee.setAge(softwareEngineer.getAge());
					return employee;
					}).collect(Collectors.toList());

		System.out.println(employeeList);
	}

}