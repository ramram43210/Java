public class EnumDemo2
{
	public enum Direction
	{
		NORTH, SOUTH, EAST, WEST
	}

	public static void main(String[] args)
	{
		/*
		 * The java compiler internally adds the values()
		 * method when it creates an enum. The values()
		 * method returns an array containing all the values
		 * of the enum.
		 */
		Directions[] directionsArray = Directions.values();
		for (Directions direction : directionsArray)
		{
			System.out.println(direction);
		}

	}
}