/*
 * Student class  implements the Person interface
 * and provides implementation of methods defined in the
 * Person Interface.
 */

public class Student implements Person
{

	private String name;

	public Student(String name)
	{
		this.name = name;
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
	public void walk()
	{
		System.out.println(name + " Walks slowly with "+numberOflegs + " legs");

	}

}
