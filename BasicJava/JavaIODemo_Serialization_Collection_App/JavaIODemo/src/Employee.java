import java.io.Serializable;

public class Employee implements Serializable
{
	private static final long serialVersionUID = 765764534241652904L;
	private int id;
	private String name;

	public Employee(int id, String name)
	{
		super();
		this.id = id;
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

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

}