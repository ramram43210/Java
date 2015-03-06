public class ToyMaker
{
		public final static String LION_TOY   = "Lion";
		public final static String DOG_TOY    = "Dog";
		public final static String MONKEY_TOY = "Monkey";

		public static AnimalToy makeToy( String toyType ) throws Exception
		{

				AnimalToyBuilder animalToyBuilder = null;

				if( toyType.equalsIgnoreCase(LION_TOY) )
				{
						animalToyBuilder = new LionToyBuilder();
				}
				else if( toyType.equalsIgnoreCase(DOG_TOY) )
				{
						animalToyBuilder = new DogToyBuilder();
				}
				else if( toyType.equalsIgnoreCase(MONKEY_TOY) )
				{
						animalToyBuilder = new MonkeyToyBuilder();
				}
				else
				{
						System.out.println("Sorry we cann't make :  " + toyType);
						throw new Exception("Sorry we cann't make :  " + toyType);
				}
				return animalToyBuilder.buildAnimalToy();
		}
}
