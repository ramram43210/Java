public class LionToyBuilder extends AnimalToyBuilder
{
		public AnimalToy createAnimalToy()
		{
				return new AnimalToy();
		}

		public void buildAnimalHead()
		{
				getAnimalToy().setAnimalToyHead("Lion head");
				System.out.println("Step 1 : Lion Head has been built");

		}

		public void buildAnimalBody()
		{
				getAnimalToy().setAnimalToyBody("Lion Body");
				System.out.println("Step 2 : Lion Body has been built");

		}

		public void buildAnimalLegs()
		{
				getAnimalToy().setAnimalToyLegs("Lion 4 legs");
				System.out.println("Step 3 : Lion Legs has been built");
		}

		public void buildAnimalArms()
		{
				// No implementation because Lion doesn't have Arms
				getAnimalToy().setAnimalToyLegs("No arms");
				System.out.println("Step 4 : is skiped because Lion doesn't have Arms");
		}

		public void setAnimalToyName()
		{
				getAnimalToy().setAnimalToyName("Lion");
		}

		public void buildAnimalTail()
		{
				getAnimalToy().setAnimalToyTail("Lion Tail");
				System.out.println("Step 5 : Lion Tail has been built");
		}
}
