public class CoffeeClient
{

		public static void main( String[] args )
		{

				System.out.println("Bru coffee preparation\n");
				CoffeeTemplate bruCoffee = new BruCoffee();
				bruCoffee.prepareCoffee();

				System.out.println("*******************************************");

				System.out.println("Nescafe coffee preparation\n");
				CoffeeTemplate NescafeCoffee = new NescafeCoffee();
				NescafeCoffee.prepareCoffee();

		}

}
