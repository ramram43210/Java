public class Employee
{
	private Integer    employeeId;
	private String name;

	public Employee( Integer employeeId, String name )
	{
		super();
		this.employeeId = employeeId;
		this.name = name;
	}

	public Integer getEmployeeId()
	{
		return employeeId;
	}

	public void setEmployeeId( int employeeId )
	{
		this.employeeId = employeeId;
	}

	public String getName()
	{
		return name;
	}

	public void setName( String name )
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		return "Employee [employeeId=" + employeeId + ", name=" + name + "]";
	}

}
