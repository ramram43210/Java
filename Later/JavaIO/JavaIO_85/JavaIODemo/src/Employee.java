import java.io.Serializable;

/*
 * Before you can serialize and de-serialize objects the
 * class of the object must implement java.io.Serializable.
 */
public class Employee implements Serializable
{

	private static final long serialVersionUID = 3558283530338723147L;
	private int id;
	private String name;

	public Employee(int id, String name)
	{
		super();
		this.id = id;
		Name = name;
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
		return Name;
	}

	public void setName(String name)
	{
		Name = name;
	}

}