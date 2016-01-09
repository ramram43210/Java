public class PolymorphismTest
{

	public static void main(String[] args)
	{
		Animal animalRef = new Lion();
		animalRef.eat();

		animalRef = new Dog();
		animalRef.eat();
	}

}
