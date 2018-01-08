import java.time.LocalTime;

public class LocalTimeDemo1
{

	public static void main(String[] args)
	{
		LocalTime time1 = LocalTime.now();
		System.out.println("time1         = " + time1);
		/*
		 * Parameters:
		 * 
		 * hoursToSubtract - the hours to subtract, may be negative
		 * 
		 * Returns:
		 * 
		 * a LocalTime based on this time with the hours subtracted,
		 * not null
		 */
		LocalTime time2 = time1.minusHours(2);
		System.out.println("Hours Changed = " + time2);

		/*
		 * Parameters:
		 * 
		 * minutesToSubtract - the minutes to subtract, may be
		 * negative
		 * 
		 * Returns:
		 * 
		 * a LocalTime based on this time with the minutes subtracted,
		 * not null
		 */
		LocalTime time3 = time1.minusMinutes(30);
		System.out.println("Min Changed   = " + time3);

		/*
		 * Parameters:
		 * 
		 * secondsToSubtract - the seconds to subtract, may be
		 * negative
		 * 
		 * Returns:
		 * 
		 * a LocalTime based on this time with the seconds subtracted,
		 * not null
		 */
		LocalTime time4 = time1.minusSeconds(10);
		System.out.println("Sec Changed   = " + time4);
	}

}
