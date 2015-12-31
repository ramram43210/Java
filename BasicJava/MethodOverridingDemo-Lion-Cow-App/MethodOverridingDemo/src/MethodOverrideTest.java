public class MethodOverrideTest
{

	public static void main(String[] args)
	{
		Animal animalRef = new Lion();
		animalRef.eat();

		animalRef = new Cow();
		animalRef.eat();
	}

}
