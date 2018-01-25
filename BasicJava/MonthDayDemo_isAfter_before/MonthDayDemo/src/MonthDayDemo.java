import java.time.MonthDay;

public class MonthDayDemo
{

	public static void main(String[] args)
	{
		MonthDay monthDay1 = MonthDay.parse("--12-30");
		MonthDay monthDay2 = MonthDay.parse("--02-20");

		/*
		 * Parameters:
		 * 
		 * other - the other month-day to compare to, not null
		 * 
		 * Returns:
		 * 
		 * true if this is after the specified month-day
		 */

		System.out.println(monthDay1.isAfter(monthDay2));
		/*
		 * Parameters:
		 * 
		 * other - the other month-day to compare to, not null
		 * 
		 * Returns:
		 * 
		 * true if this point is before the specified month-day
		 */
		System.out.println(monthDay1.isBefore(monthDay2));
		/*
		 * Parameters:
		 * 
		 * obj - the object to check, null returns false
		 * 
		 * Returns:
		 * 
		 * true if this is equal to the other month-day
		 * 
		 */
		System.out.println(monthDay1.equals(monthDay2));
	}

}
