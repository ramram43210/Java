public class CreditCardPaymentStrategy implements PaymentStrategy
{

		public void pay( String amount )
		{
				System.out.println("Customer pays the money " + amount + "Rs. using Credit Card");
		}

}