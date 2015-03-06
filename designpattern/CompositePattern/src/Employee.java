import java.util.ArrayList;



// Employee class is the Composite node [i.e. it can have other objects below it]

public class Employee implements IEmployee
{

		private String               name;
		private int                  monthlySalary;
		
		// Employee designation Can be CEO,Dev Manager,QA Manager,Dev TeamLead,QA TeamLead
		
		private String               designation;

		private ArrayList<IEmployee> subordinateList = new ArrayList<IEmployee>();

		public Employee( String name, int monthlySalary, String designation )
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

		public ArrayList<IEmployee> getSubordinateList()
		{
				return subordinateList;
		}

		public void setSubordinateList( ArrayList<IEmployee> subordinateList )
		{
				this.subordinateList = subordinateList;
		}

		@Override
		public int getYearlySalary()
		{
				return monthlySalary * 12;
		}

		public void addSubordinate( IEmployee employee )
		{
				subordinateList.add(employee);
		}

		public void removeSubordinate( IEmployee employee )
		{
				subordinateList.remove(employee);
		}

		public ArrayList<IEmployee> getChilds()
		{
				return getSubordinateList();
		}

}
