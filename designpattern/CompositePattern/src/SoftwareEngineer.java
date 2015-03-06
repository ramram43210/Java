


// SoftwareEngineer class is the Leaf node [i.e. it cann't have other objects below it]

public class SoftwareEngineer implements IEmployee
{
		private String name;
		private int    monthlySalary;
		
		// Employee designation Can be Dev Software Engineer, QA Software Engineer
		private String designation;

		public SoftwareEngineer( String name, int monthlySalary, String designation )
		{
				super();
				this.name = name;
				this.monthlySalary = monthlySalary;
				this.designation = designation;
		}

		public String getName()
		{
				return name;
		}

		public void setName( String name )
		{
				this.name = name;
		}

		public int getMonthlySalary()
		{
				return monthlySalary;
		}

		public void setMonthlySalary( int monthlySalary )
		{
				this.monthlySalary = monthlySalary;
		}

		public String getDesignation()
		{
				return designation;
		}

		public void setDesignation( String designation )
		{
				this.designation = designation;
		}

		@Override
		public int getYearlySalary()
		{
				return monthlySalary * 12;
		}

}
