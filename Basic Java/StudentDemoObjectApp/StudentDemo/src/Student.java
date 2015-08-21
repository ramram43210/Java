/**
 * Student class is the blueprint from which individual student objects can be
 * created.
 */
public class Student
{
	String name;
	int age;
	String color;
	String sex;

	public void eating(String string)
	{
		System.out.println(name + " "+ string);
	}

	public void drinking(String string)
	{
		System.out.println(name + " "+ string);
	}

	public void running(String string)
	{
		System.out.println(name + " "+ string);
	}
}