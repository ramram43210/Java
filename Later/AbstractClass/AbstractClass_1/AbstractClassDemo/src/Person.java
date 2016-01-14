public abstract class Person
{

	abstract public void walk();

	public void eat()
	{
		System.out.println("Eating Pizza.");
	}

}

class Student extends Person
{

	@Override
	public void walk()
	{
		System.out.println("Walks slowly.");

	}

}

