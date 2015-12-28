public class RunTimePolymorphismDemo
{

	public static void main(String[] args)
	{
		Animal animal = new Animal();
		animal.whoAmI();

		animal = new Dog();
		animal.whoAmI();
		
		animal = new Lion();
		animal.whoAmI();
		
		animal = new Tiger();
		animal.whoAmI();		
	}

}
