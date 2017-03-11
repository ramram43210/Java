public class EnumDemo3
{
	public enum Season
	{
		WINTER, SPRING, SUMMER, FALL
	}

	public static void main(String[] args)
	{
		/*
		 * The java compiler internally adds the values()
		 * method when it creates an enum. The values()
		 * method returns an array containing all the values
		 * of the enum.
		 */
		Season[] seasonArray = Season.values();
		for (Season season : seasonArray)
		{
			System.out.println(season);
		}

	}
}