import java.sql.Time;
import java.time.LocalTime;

public class TimeDemo2
{

	public static void main(String[] args)
	{

		Time time = Time.valueOf("15:06:20");

		/*
		 * 
		 * The conversion creates a LocalTime that represents the same
		 * hour, minute, and second time value as this Time.
		 * 
		 * Returns:
		 * 
		 * a LocalTime object representing the same time value
		 */
		LocalTime localTime = time.toLocalTime();
		System.out.println(localTime);

	}

}
