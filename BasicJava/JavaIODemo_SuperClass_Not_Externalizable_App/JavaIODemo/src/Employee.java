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
		System.out.println("Inside writeExternal");

		/*
		 * Since superclass does not implement
		 * externalizable, we need to serialize super class
		 * field in this class itself
		 * 
		 * Person class[Super class] fields
		 */
		out.writeInt(super.getAge());
		out.writeDouble(super.getHeight());
		out.writeDouble(super.getWeight());

		/* Employee class fields */
		out.writeInt(id);
		out.writeObject(name);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException
	{
		System.out.println("Inside readExternal");

		/*
		 * Since superclass does not implement
		 * externalizable, we need to deserialize super
		 * class field in this class itself.
		 * 
		 * Person class[Super class] fields.
		 */

		super.setAge(in.readInt());
		super.setHeight(in.readDouble());
		super.setWeight(in.readDouble());

		/* Employee class fields */
		id = in.readInt();
		name = (String) in.readObject();
	}

}