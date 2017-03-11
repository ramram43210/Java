public class EnumInsideDemo
{
	/*
	 * Enum is Defined inside of the class.
	 */
	private enum Day
	{
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
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
			System.out.println(day);
		}

	}
}