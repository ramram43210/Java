import java.util.ArrayList;

public class EmployeeAdapter extends ThirdPartyBillingSystem implements ITarget
{

		/*
		 * This Adapter method converts String Array employee information to
		 * ArrayList of Employees
		 */

		@Override
		public void processCompanySalary( String[][] employeeInfo )
		{
				String empId = null;
				String name = null;
				String designation = null;
				ArrayList<Employee> employeeList = new ArrayList<Employee>();
				for( int i = 0; i < employeeInfo.length; i++ )
				{

						for( int j = 0; j < employeeInfo[i].length; j++ )
						{
								if( j == 0 )
								{
										empId = employeeInfo[i][j];
								}
								else if( j == 1 )
								{
										name = employeeInfo[i][j];
								}
								else
								{
										designation = employeeInfo[i][j];
								}
						}
						employeeList.add(new Employee(Integer.parseInt(empId), name, designation));

				}

				System.out.println("Adapter converted Array of Employee to ArrayList of Employee : \n"+employeeList+"\n"+
						"then call the processSalary method inherited from the ThirdPartyBillingSystem for processing the employee salary");
				processSalary(employeeList);

		}

}
