public class HotelWaiter
{

		public static Beverage takeOrder( String beverageType )
		{

				BeverageBuilder beverageBuilder = null;

				if( beverageType.equalsIgnoreCase("tea") )
				{
						beverageBuilder = new TeaBuider();
				}
				else if( beverageType.equalsIgnoreCase("coffee") )
				{
						beverageBuilder = new CoffeeBuilder();
				}
				else
				{
						System.out.println("Sorry we don't take order for  " + beverageType);
				}
				return beverageBuilder.buildBeverage();
		}

}