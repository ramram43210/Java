import java.util.Hashtable;

public class AnimalCache
{
		private static Hashtable<String, Animal> AnimalMap = new Hashtable<String, Animal>();

		public static Animal getAnimal( String animalType )
		{
				Dog dog = (Dog) AnimalMap.get(animalType);
				if( dog == null )
				{
						Dogleg dogleg = new Dogleg();
						dogleg.setNumberOflegs(4);

						Dogear dogear = new Dogear();
						dogear.setNumberOfEars(2);

						Dogtail dogtail = new Dogtail();
						dogtail.setTailLength("long");

						Dogeye dogeye = new Dogeye();
						dogeye.setNumberOfEyes(2);

						dog = new Dog("Tommy", 3, "White", dogleg, dogtail, dogear, dogeye);
						AnimalMap.put("dog", dog);
						System.out.println("New Dog Object is created and return\n");
						return dog;
				}
				System.out.println("\nCloned Dog Object is created and return\n");
				return dog.clone();
		}
}
