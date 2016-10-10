import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee extends Person implements Externalizable
{
	private int id;
	private String name;

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

	@Override
	public String toString()
	{
		return "Employee [getId()=" + getId() + ", getName()=" + getName()
				+ ", getAge()=" + getAge() + ", getHeight()=" + getHeight()
				+ ", getWeight()=" + getWeight() + "]";
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException
	{
		System.out.println("Inside writeExternal method of Employee.");
		super.writeExternal(out);
		/* Employee class fields */
		out.writeInt(id);
		out.writeObject(name);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException
	{
		System.out.println("Inside readExternal method of Employee.");
		super.readExternal(in);
		/* Employee class fields */
		id = in.readInt();
		name = (String) in.readObject();
	}

}