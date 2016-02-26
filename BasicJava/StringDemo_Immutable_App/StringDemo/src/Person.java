/*
 * Person is an immutable class. Person's 
 * state cannot be changed once it is created.
 * 
 * We can't subclass the final class and 
 * alter the behavior.
 */
public final class Person
{

	final String name;

	public Person(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

}
