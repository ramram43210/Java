/**
 * Person class is the blueprint from which individual Person objects can be
 * created.
 */
public class Person
{
	String name;
	int age;

	public void displayMsg()
	{
		System.out.println("I am " + name);
		System.out.println("I am " + age + " yrs. old");
	}

}