public class EnumDemo
{

	private enum Day
	{
		MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6),
																	SUNDAY(7);

		private int whichDay;

		/*
		 * Constructor of enum type is private. If you don't
		 * declare private compiler internally creates
		 * private constructor.
		 */
		private Day(int whichDay)
		{
			this.whichDay = whichDay;
		}

	}

	public static void main(String[] args)
	{
		/*
		 * The java compiler internally adds the values()
		 * method when it creates an enum. The values()
		 * method returns an array containing all the values
		 * of the enum.
		 */
		Day[] daysArray = Day.values();
		for (Day day : daysArray)
		{
			System.out.println(day + " is which day? " + day.whichDay);
		}

	}
}