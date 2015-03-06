public class AnimalFactory
{
		public Animal getAnimal( String animalType )
		{
				Animal animal = null;
				if( "dog".equals(animalType) )
				{
						animal = new Dog();
				}
				else if( "duck".equals(animalType) )
				{
						animal = new Duck();
				}
				else if( "lion".equals(animalType) )
				{
						animal = new Lion();
				}
				return animal;
		}
}
