public class AbstractClassTest
{

	public static void main(String[] args)
	{
		Bank bankRef = new HDFC();
		System.out.println("HDFC Bank : "+bankRef.getRateOfInterest());
		
		bankRef = new ICICI();
		System.out.println("ICICI Bank : "+bankRef.getRateOfInterest());
	}

}
