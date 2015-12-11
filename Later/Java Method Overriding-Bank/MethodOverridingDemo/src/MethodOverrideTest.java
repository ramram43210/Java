public class MethodOverrideTest
{

	public static void main(String[] args)
	{
		Bank bank = new Hdfc();
		int rateOfInterest = bank.getRateOfInterest();
		
		System.out.println("Rate of Interest provided by HDFC : " + rateOfInterest);

		bank = new Icici();
		bank.getRateOfInterest();
		rateOfInterest = bank.getRateOfInterest();
		
		System.out.println("Rate of Interest provided by ICICI : " + rateOfInterest);
	}

}
