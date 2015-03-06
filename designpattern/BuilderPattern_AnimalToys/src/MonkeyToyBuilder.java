public class MonkeyToyBuilder extends AnimalToyBuilder
{
		public AnimalToy createAnimalToy()
		{
				return new AnimalToy();
		}

		public void buildAnimalHead()
		{
				getAnimalToy().setAnimalToyHead("Monkey head");
				System.out.println("Step 1 : Monkey Head has been built");

		}

		public void buildAnimalBody()
		{
				getAnimalToy().setAnimalToyBody("Monkey Body");
				System.out.println("Step 2 : Monkey Body has been built");

		}

		public void buildAnimalLegs()
		{
				getAnimalToy().setAnimalToyLegs("Monkey 2 legs");
				System.out.println("Step 3 : Monkey Legs has been built");
		}

		public void buildAnimalArms()
		{
				getAnimalToy().setAnimalToyArms("Monkey 2 Arms");
				System.out.println("Step 4 : Monkey Arms has been built");
		}

		public void setAnimalToyName()
		{
				getAnimalToy().setAnimalToyName("Monkey");
		}

		public void buildAnimalTail()
		{
				getAnimalToy().setAnimalToyTail("Monkey Tail");
				System.out.println("Step 5 : Monkey Tail has been built");
		}
}
