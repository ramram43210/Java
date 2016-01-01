public class MethodOverrideTest
{

	public static void main(String[] args)
	{
		Bank bankref = new Hdfc();
		int rateOfInterest = bankref.getRateOfInterest();
		
		System.out.println("Rate of Interest provided by HDFC : " + rateOfInterest);

		bankref = new Icici();
		rateOfInterest = bankref.getRateOfInterest();
		
		System.out.println("Rate of Interest provided by ICICI : " + rateOfInterest);
	}

}
