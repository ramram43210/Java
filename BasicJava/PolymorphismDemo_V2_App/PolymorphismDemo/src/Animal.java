public class Animal
{
	public void eat()
	{
		System.out.println("Animal is eating...");
	}
}

class Lion extends Animal
{
	public void eat()
	{
		System.out.println("Lion is Eating meat...");
	}
}

class Dog extends Animal
{
	public void eat()
	{
		System.out.println("Dog is Eating chicken...");
	}
}