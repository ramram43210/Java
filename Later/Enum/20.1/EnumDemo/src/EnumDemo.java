/*
 * How to use enum & switch statement ?
 */
enum Car
{
	tata, audi, fiat, honda
}

public class EnumDemo
{
	public static void main(String args[])
	{
		Car c;
		c = Car.audi;
		switch (c)
		{
		case tata:
			System.out.println("You choose tata!");
			break;
		case audi:
			System.out.println("You choose audi!");
			break;
		case fiat:
			System.out.println("You choose fiat!");
			break;
		case honda:
			System.out.println("You choose honda!");
			break;
		default:
			System.out.println("I don't know your car.");
			break;
		}

	}
}