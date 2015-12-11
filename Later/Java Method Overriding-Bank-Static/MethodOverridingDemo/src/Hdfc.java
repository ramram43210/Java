public class Hdfc extends Bank
{

	/*
	 * static method cannot be overridden, because static method is bound with
	 * class whereas instance method is bound with object. Static belongs to
	 * class area and instance belongs to heap area.
	 */
	public static int getRateOfInterest()
	{
		return 10;
	}
}
