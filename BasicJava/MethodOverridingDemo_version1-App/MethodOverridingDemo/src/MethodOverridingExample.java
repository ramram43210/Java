class Animal
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

public class MethodOverridingExample
{
	public static void main(String args[])
	{
		Animal animalRef = new Lion();
		animalRef.eat();
	}
}