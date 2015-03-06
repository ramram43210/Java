import java.util.List;

public interface EmployeeDao
{
		public List<Employee> getAllEmployees();

		public void addEmployee( Employee employee );
		
		public Employee getEmployee( int employeeId );

		public void updateEmployee( Employee employee );

		public void deleteEmployee( int employeeId );
}
