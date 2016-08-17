import java.io.Serializable;

public class Employee implements Serializable
{
	private static final long serialVersionUID = 3558283530338723147L;
	private int id;
	private int Name;

	public Employee(int id, int name)
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

	public int getName()
	{
		return Name;
	}

	public void setName(int name)
	{
		Name = name;
	}
}