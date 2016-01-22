public abstract class Bank
{
	abstract int getRateOfInterest();
}

class HDFC extends Bank
{

	@Override
	int getRateOfInterest()
	{
		return 10;
	}
	
}

class ICICI extends Bank
{

	@Override
	int getRateOfInterest()
	{
		return 7;
	}
	
}
