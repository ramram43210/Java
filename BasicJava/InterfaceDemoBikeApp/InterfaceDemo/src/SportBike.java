/**
 * 
 * To implement Bike interface, the name of your class would change (to a
 * particular brand of Bike, for example, such as SportBike)
 *
 */

public class SportBike implements Bike
{

	int speed = 0;
	int gear = 1;

	/*
	 * The compiler will now require that methods changeGear, speedUp, and
	 * applyBrakes all be implemented. Compilation will fail if those methods
	 * are missing from this class.
	 */

	@Override
	public void changeGear(int newValue)
	{
		gear = newValue;

	}

	@Override
	public void speedUp(int increment)
	{
		speed = speed + increment;
	}

	@Override
	public void applyBrakes(int decrement)
	{
		speed = speed - decrement;
	}

	public void printStates()
	{
		System.out
				.println("SportBike [speed=" + speed + ", gear=" + gear + "]");
	}

}
