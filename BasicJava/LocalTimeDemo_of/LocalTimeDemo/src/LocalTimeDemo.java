import java.time.LocalTime;

public class LocalTimeDemo
{

	public static void main(String[] args)
	{
		/*
		 * Parameters:
		 *
		 * hour - the hour-of-day to represent, from 0 to 23
		 *
		 * minute - the minute-of-hour to represent, from 0 to 59
		 *
		 * second - the second-of-minute to represent, from 0 to 59
		 *
		 * Returns:the local time, not null
		 */
		LocalTime time = LocalTime.of(8, 53, 56);
		System.out.println(time);
	}

}
