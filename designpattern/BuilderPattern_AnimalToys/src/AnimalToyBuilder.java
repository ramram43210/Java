public abstract class AnimalToyBuilder
{
		private AnimalToy animalToy;

		public AnimalToy getAnimalToy()
		{
				return animalToy;
		}

		public void setAnimalToy( AnimalToy animalToy )
		{
				this.animalToy = animalToy;
		}

		public final AnimalToy buildAnimalToy()
		{
				AnimalToy animalToy = createAnimalToy();
				setAnimalToy(animalToy);
				buildAnimalHead();
				buildAnimalBody();
				buildAnimalLegs();
				buildAnimalArms();
				buildAnimalTail();
				setAnimalToyName();
				return animalToy;
		}

		public abstract void buildAnimalHead();

		public abstract void buildAnimalBody();

		public abstract void buildAnimalLegs();

		public abstract void buildAnimalArms();

		public abstract void buildAnimalTail();

		public abstract void setAnimalToyName();

		public abstract AnimalToy createAnimalToy();
}
