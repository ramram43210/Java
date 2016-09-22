import java.io.Serializable;

/*
 * Before you can serialize and de-serialize objects the
 * class of the object must implement java.io.Serializable.
 */
public class Employee implements Serializable
{

	private static final long serialVersionUID = 3558283530338723147L;
	private String name;
	private int id;

	public Employee(String name, int id)
	{
		super();
		this.name = name;
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

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	@Override
	public String toString()
	{
		return "Employee [name=" + name + ", id=" + id + "]";
	}

}