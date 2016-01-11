
public class PolymorphismTest
{

	public static void main(String[] args)
	{
		Animal animalRef = new Lion();
		animalRef.makeNoise();//Prints Roar.
		
		animalRef = new Dog();
		animalRef.makeNoise();//Prints Bark.
	}

}
