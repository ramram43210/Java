public class RunTimePolymorphismDemo
{

	public static void main(String[] args)
	{
		Animal animalRef = new Animal();
		animalRef.whoAmI();

		animalRef = new Dog();
		animalRef.whoAmI();
		
		animalRef = new Lion();
		animalRef.whoAmI();
		
		animalRef = new Tiger();
		animalRef.whoAmI();		
	}

}
