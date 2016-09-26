import java.io.Serializable;

/*
 * Before you can serialize and de-serialize objects the
 * class of the object must implement java.io.Serializable.
 */
public class Student implements Serializable
{

	private static final long serialVersionUID = -1438960132000208485L;
	private String name;
	private int age;

	public Student(String name, int age)
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

	@Override
	public String toString()
	{
		return "Student [name=" + name + ", age=" + age + "]";
	}

}