/*
 *  Customer who is in hotel and customer can place order to 
 *  HotelWaiter or Servant.
 */
public class BuilderClient
{
		public static void main( String[] args )
		{

				Beverage tea = HotelWaiter.takeOrder("tea");
				System.out.println(tea);
				
				Beverage coffee = HotelWaiter.takeOrder("coffee");
				System.out.println(coffee);
		}
}