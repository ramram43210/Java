import java.util.ArrayList;

/*
 * ThirdPartyBillingSystem accepts employees information as a List to process each employee salary
 */
public class ThirdPartyBillingSystem
{
		public void processSalary( ArrayList<Employee> employeeList )
		{
				for( Employee employee : employeeList )
				{
						System.out.print("\n"+employee.toString()+" : ");
						if( employee.getDesignation().equalsIgnoreCase("Team Leader") )
						{
								System.out.println("70000Rs Salary credited to " + employee.getName() + " Account\n");
						}
						else if( employee.getDesignation().equalsIgnoreCase("Developer") )
						{
								System.out.println("40000Rs Salary credited to " + employee.getName() + " Account\n");
						}
						else if( employee.getDesignation().equalsIgnoreCase("Tester") )
						{
								System.out.println("30000Rs Salary credited to " + employee.getName() + " Account\n");
						}
				}
		}

}
