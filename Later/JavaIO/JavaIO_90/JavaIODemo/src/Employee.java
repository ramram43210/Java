import java.io.Serializable;

public class Employee implements Serializable
{
	private static final long serialVersionUID = 765764534241652904L;
	private int id;
	private String name;
	/*
	 * If we don't want to serialize any data member of a
	 * class, you can mark it as transient.
	 */
	private transient int age;

	public Employee(int id, String name, int age)
	{
		super();
		this.id = id;
		this.name = name;
		this.age = age;
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

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

}