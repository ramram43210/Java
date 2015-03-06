public class DogToyBuilder extends AnimalToyBuilder
{
		public AnimalToy createAnimalToy()
		{
				return new AnimalToy();

		}

		public void buildAnimalHead()
		{
				getAnimalToy().setAnimalToyHead("Dog head");
				System.out.println("Step 1 : Dog Head has been built");

		}

		public void buildAnimalBody()
		{
				getAnimalToy().setAnimalToyBody("Dog Body");
				System.out.println("Step 2 : Dog Body has been built");

		}

		public void buildAnimalLegs()
		{
				getAnimalToy().setAnimalToyLegs("Dog 4 legs");
				System.out.println("Step 3 : Dog Legs has been built");
		}

		public void buildAnimalArms()
		{
				// No implementation because dog doesn't have Arms
				getAnimalToy().setAnimalToyLegs("No arms");
				System.out.println("Step 4 : is skiped because dog doesn't have Arms");
		}

		public void setAnimalToyName()
		{
				getAnimalToy().setAnimalToyName("Dog");
		}

		public void buildAnimalTail()
		{
				getAnimalToy().setAnimalToyTail("Dog Tail");
				System.out.println("Step 5 : Dog Tail has been built");
		}
}
