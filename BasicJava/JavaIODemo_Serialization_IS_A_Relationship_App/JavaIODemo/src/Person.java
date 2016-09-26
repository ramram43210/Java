import java.io.Serializable;

/*
 * If a class implements serializable then all its sub
 * classes will also be serializable.
 */
public class Person implements Serializable
{

	private static final long serialVersionUID = -7438582605700356851L;
	protected String name;
	protected int age;

	public Person(String name, int age)
	{
		super();
		this.name = name;
		this.age = age;
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
