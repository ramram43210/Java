/**
 * 
 * Employee class extends Person class means Employee IS-A Person.
 * 
 * Employee extends Person and thus inherits all methods and properties from
 * Person (except final and static).
 * 
 * Employee can also define all its specific functionality.
 */
public class Employee extends Person
{
	private String departmentName;
	private int employeeId;

	/*
	 * Employee HAS-A Address
	 */
	private Address address;

	public Employee(String name, int age, String departmentName,
			int employeeId, Address address)
	{
		super(name, age);
		this.departmentName = departmentName;
		this.employeeId = employeeId;
		this.address = address;
	}

	public String getDepartmentName()
	{
		return departmentName;
	}

	public void setDepartmentName(String departmentName)
	{
		this.departmentName = departmentName;
	}

	public int getEmployeeId()
	{
		return employeeId;
	}

	public void setEmployeeId(int employeeId)
	{
		this.employeeId = employeeId;
	}

	public Address getAddress()
	{
		return address;
	}

	public void setAddress(Address address)
	{
		this.address = address;
	}

	@Override
	public String toString()
	{
		return "Employee [departmentName=" + departmentName + ", employeeId="
				+ employeeId + ", address=" + address + ", getName()="
				+ getName() + ", getAge()=" + getAge() + "]";
	}

}
