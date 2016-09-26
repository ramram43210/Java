import java.io.Serializable;

/*
 * If a class has a reference of another class, all the
 * references must be Serializable otherwise
 * serialization process will not be performed. In such
 * case, NotSerializableException is thrown at runtime.
 * 
 * If Address is not Serializable, we cannot serialize
 * the instance of Employee class.
 */
public class Employee implements Serializable
{

	private static final long serialVersionUID = 765764534241652904L;
	private int id;
	private String name;
	private Address address; // HAS-A

	public Employee(int id, String name, Address address)
	{
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Address getAddress()
	{
		return address;
	}

	public void setAddress(Address address)
	{
		this.address = address;
	}

}