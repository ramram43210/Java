import java.time.LocalTime;

public class LocalTimeDemo2
{

	public static void main(String[] args)
	{
		LocalTime time1 = LocalTime.now();
		System.out.println("time1         = " + time1);

		/*
		 * Parameters:
		 * 
		 * hoursToAdd - the hours to add, may be negative
		 * 
		 * Returns:
		 * 
		 * a LocalTime based on this time with the hours added, not
		 * null
		 */
		LocalTime time2 = time1.plusHours(2);
		System.out.println("Hours Changed = " + time2);

		/*
		 * Parameters:
		 * 
		 * minutesToAdd - the minutes to add, may be negative
		 * 
		 * Returns:
		 * 
		 * a LocalTime based on this time with the minutes added, not
		 * null
		 */
		LocalTime time3 = time1.plusMinutes(30);
		System.out.println("Min Changed   = " + time3);

		/*
		 * Parameters:
		 * 
		 * secondstoAdd - the seconds to add, may be negative
		 * 
		 * Returns:
		 * 
		 * a LocalTime based on this time with the seconds added, not
		 * null
		 */
		LocalTime time4 = time1.plusSeconds(10);
		System.out.println("Sec Changed   = " + time4);
	}

}
