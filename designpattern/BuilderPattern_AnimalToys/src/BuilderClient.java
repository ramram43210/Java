
public class BuilderClient
{

		public static void main( String[] args ) throws Exception
		{
				AnimalToy lionToy = ToyMaker.makeToy(ToyMaker.LION_TOY);
				System.out.println(lionToy);
				
				AnimalToy dogToy = ToyMaker.makeToy(ToyMaker.DOG_TOY);
				System.out.println(dogToy);
				
				AnimalToy monkeyToy = ToyMaker.makeToy(ToyMaker.MONKEY_TOY);
				System.out.println(monkeyToy);

		}

}
