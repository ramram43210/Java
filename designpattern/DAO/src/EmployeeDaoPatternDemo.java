public class EmployeeDaoPatternDemo
{

		public static void main( String[] args )
		{
				EmployeeDao employeeDao = new EmployeeDaoImpl();

				// Add new Employees
				
				Employee employeeDavid = new Employee();
				employeeDavid.setEmployeeId(1);
				employeeDavid.setName("David");
				employeeDavid.setAge(23);
				
				employeeDao.addEmployee(employeeDavid);
				
				Employee employeeJohn= new Employee();
				employeeJohn.setEmployeeId(2);
				employeeJohn.setName("John");
				employeeJohn.setAge(34);
				
				employeeDao.addEmployee(employeeJohn);
				
				System.out.println();
				System.out.println("-------------------------Print all the Employees-------------------------------- Start");
				
				// print all Employees
				for( Employee employee : employeeDao.getAllEmployees() )
				{
						System.out.println("employee: [Employee Id : " + employee.getEmployeeId() + ", Name : "
						                + employee.getName() + ",age :" + employee.getAge()+" ]");
				}
				
				System.out.println("-------------------------Print all the Employees-------------------------------- End");
				System.out.println();

				System.out.println("-------------------------Get one Employee based in employee Id =1 ----------- Start");
							
				Employee employee= employeeDao.getEmployee(1);
				System.out.println("employee: [Employee Id : " + employee.getEmployeeId() + ", Name : "
				                + employee.getName() + ",age :" + employee.getAge()+" ]");
				
				
				System.out.println("-------------------------Get one Employee based in employee Id =1 ----------- End");
				System.out.println();
				
				
				System.out.println("-------------------------update the employee whose employee Id =1 ----------- Start");
				
				Employee employeeRohan= new Employee();
				employeeRohan.setEmployeeId(1);
				employeeRohan.setName("Rohan");
								
				employeeDao.updateEmployee(employeeRohan);
				
				System.out.println("-------------------------update the employee whose employee Id =1 ----------- End");
				System.out.println();
			
				System.out.println("-------------------------Delete the employee whose employee Id =2 ----------- Start");
				
				employeeDao.deleteEmployee(2);

				System.out.println("-------------------------Delte the employee whose employee Id =2 ----------- End");	
		}

}
