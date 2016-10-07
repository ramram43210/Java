import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable
{
	private int id;
	private String name;
	private int age;

	public Employee()
	{

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

	@Override
	public String toString()
	{
		return "Employee [id=" + id + ", name=" + name + 
				", age=" + age + "]";
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException
	{
		System.out.println("Inside readExternal");
		id = in.readInt();
		name = (String) in.readObject();
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException
	{
		System.out.println("Inside writeExternal");
		out.writeInt(id);
		out.writeObject(name);
	}

}