import java.util.ArrayList;

public class CompositePatternDemo
{

		public static void main( String[] args )
		{
				Employee dave = new Employee("Dave", 200000, "CEO");

				Employee peter = new Employee("peter", 100000, "Dev Manager");
				Employee john = new Employee("John", 100000, "QA Manager");

				Employee rohan = new Employee("Rohan", 50000, "Dev TeamLead");
				Employee vijay = new Employee("Vijay", 50000, "QA TeamLead");

				SoftwareEngineer raj = new SoftwareEngineer("Raj", 30000, "Dev Software Engineer");
				SoftwareEngineer mohan = new SoftwareEngineer("Mohan", 30000, "Dev Software Engineer");
				SoftwareEngineer hema = new SoftwareEngineer("Hema", 30000, "Dev Software Engineer");

				SoftwareEngineer saran = new SoftwareEngineer("Saran", 20000, "QA Software Engineer");
				SoftwareEngineer riya = new SoftwareEngineer("Riya", 20000, "QA Software Engineer");

				dave.addSubordinate(peter);
				dave.addSubordinate(john);

				peter.addSubordinate(rohan);
				john.addSubordinate(vijay);

				rohan.addSubordinate(raj);
				rohan.addSubordinate(mohan);
				rohan.addSubordinate(hema);

				vijay.addSubordinate(saran);
				vijay.addSubordinate(riya);


				getSubOrdinates(dave);
				getSubOrdinates(peter);
				getSubOrdinates(john);
				getSubOrdinates(rohan);
				getSubOrdinates(vijay);
				getSubOrdinates(raj);
				getSubOrdinates(mohan);
				getSubOrdinates(hema);
				getSubOrdinates(saran);
				getSubOrdinates(riya);
				
				


		}

		private static void getSubOrdinates( IEmployee iemployee )
		{
				if( iemployee instanceof Employee )
				{
						Employee employee = (Employee) iemployee;
						System.out.println("\n------------- SubordinatesListOf "+ employee.getName() +" : "+employee.getDesignation() + " ---------------------------------\n");
						ArrayList<IEmployee> subordinatesListOfDave = employee.getChilds();
						for( IEmployee iEmployee : subordinatesListOfDave )
						{
								if( iEmployee instanceof Employee )
								{
										Employee employeeObj = (Employee) iEmployee;
										System.out.println(employeeObj.getName() + " : " + employeeObj.getDesignation() + ":"
										                + employeeObj.getMonthlySalary() + ":" + employeeObj.getYearlySalary());
								}
								else
								{
										SoftwareEngineer softwareEngineer = (SoftwareEngineer) iEmployee;
										System.out.println(softwareEngineer.getName() + " : "
										                + softwareEngineer.getDesignation() + ":"
										                + softwareEngineer.getMonthlySalary() + ":"
										                + softwareEngineer.getYearlySalary());

								}

						}
				}
				else
				{
						System.out.println("\n--------------------------------------------------------------------------------------");
						SoftwareEngineer softwareEngineer = (SoftwareEngineer) iemployee;
						System.out.println("\nNo Subordinates for "+softwareEngineer.getName()+" : "+softwareEngineer.getDesignation()
										+" : "+softwareEngineer.getMonthlySalary()+" : "+softwareEngineer.getYearlySalary());
				}
				
		}

}
