public class EnumDemo
{

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
			System.out.println(season + ", SeasonNumber =  "
									+ season.getSeasonNumber());
		}

	}
}