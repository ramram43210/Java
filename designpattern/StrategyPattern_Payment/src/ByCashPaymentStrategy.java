public class ByCashPaymentStrategy implements PaymentStrategy
{

		public void pay( String amount )
		{
				System.out.println("Customer pays the money " + amount + "Rs. as a Cash");
		}

}