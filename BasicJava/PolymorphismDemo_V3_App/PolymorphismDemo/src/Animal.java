public class Animal
{
	public void makeNoise()
	{
		System.out.println("Some sound.");
	}
}

class Lion extends Animal
{
	public void makeNoise()
	{
		System.out.println("Roar.");
	}
}

class Dog extends Animal
{
	public void makeNoise()
	{
		System.out.println("Bark.");
	}
}