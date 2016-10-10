import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Person implements Externalizable
{
	private int age;
	private double height;
	private double weight;

	public Person()
	{

	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public double getHeight()
	{
		return height;
	}

	public void setHeight(double height)
	{
		this.height = height;
	}

	public double getWeight()
	{
		return weight;
	}

	public void setWeight(double weight)
	{
		this.weight = weight;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException
	{
		System.out.println("Inside writeExternal method of Person.");
		/* Person class fields */
		out.writeInt(age);
		out.writeDouble(height);
		out.writeDouble(weight);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException
	{
		System.out.println("Inside readExternal method of Person.");
		/* Person class fields */
		age = in.readInt();
		height = in.readDouble();
		weight = in.readDouble();
	}

}
