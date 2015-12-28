import java.io.IOException;

class Animal
{
	void eat()
	{
		System.out.println("Animal is eating.");
	}
}

class Dog extends Animal
{
	void eat() throws IOException
	{
		System.out.println("Dog is eating meat.");
	}
}

	