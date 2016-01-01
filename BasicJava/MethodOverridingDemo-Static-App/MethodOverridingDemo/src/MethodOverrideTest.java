public class MethodOverrideTest
{

	public static void main(String[] args)
	{
		Bank bankRef = new Hdfc();
		int rateOfInterest = bankRef.getRateOfInterest();
		
		System.out.println("Rate of Interest provided by HDFC : " + rateOfInterest);

		bankRef = new Icici();
		rateOfInterest = bankRef.getRateOfInterest();
		
		System.out.println("Rate of Interest provided by ICICI : " + rateOfInterest);
	}

}
