/*
 * How to use enum & switch statement?
 */
enum Car
{
	TATA, AUDI, FIAT, HONDA
}

public class EnumDemo
{
	public static void main(String args[])
	{
		Car car;
		car = Car.AUDI;
		switch (car)
		{
		case TATA:
			System.out.println("You choose tata!");
			break;
		case AUDI:
			System.out.println("You choose audi!");
			break;
		case FIAT:
			System.out.println("You choose fiat!");
			break;
		case HONDA:
			System.out.println("You choose honda!");
			break;
		default:
			System.out.println("I don't know your car.");
			break;
		}

	}
}