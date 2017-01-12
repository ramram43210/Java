public class EnumDemo
{
	public enum Day
	{
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}

	public static void main(String[] args)
	{
		Day day = Day.TUESDAY;

		/*
		 * We can apply enum on switch statement
		 */
		switch (day)
		{
		case SUNDAY:
			System.out.println("sunday");
			break;
		case MONDAY:
			System.out.println("monday");
			break;
		case TUESDAY:
			System.out.println("Tuesday");
			break;

		default:
			System.out.println("other day");
		}
	}
}