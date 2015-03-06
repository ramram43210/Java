
public class SeaAnimalFactory extends AnimalFactory
{
		public Animal getAnimal( String animalType )
		{
				Animal animal = null;
				if( "shark".equals(animalType) )
				{
						animal = new Shark();
				}
				else if( "octopus".equals(animalType) )
				{
						animal = new Octopus();
				}
				return animal;
		}
}
