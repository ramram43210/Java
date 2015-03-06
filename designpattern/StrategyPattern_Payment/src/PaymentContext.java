public class PaymentContext
{
	private PaymentStrategy paymentStrategy;

	// Client will set what PaymentStrategy to use by calling this method
	public void setPaymentStrategy(PaymentStrategy strategy)
	{
		this.paymentStrategy = strategy;
	}

	public PaymentStrategy getPaymentStrategy()
	{
		return paymentStrategy;
	}

	public void pay(String amount)
	{
		paymentStrategy.pay(amount);
	}

}