public class Student implements Person
{

	private String name;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public void walk()
	{
		System.out.println(name + " is Walking...");

	}

}
