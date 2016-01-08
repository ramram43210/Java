class Animal
{
	void eat() throws ArithmeticException
	{
		System.out.println("Animal is eating.");
	}
}

class Dog extends Animal
{
	void eat() throws Exception
	{
		System.out.println("Dog is eating meat.");
	}
}
