import java.sql.Time;
import java.time.LocalTime;

public class TimeDemo
{

	public static void main(String[] args)
	{

		LocalTime localTime = LocalTime.now();
		System.out.println("localTime = " + localTime);

		/*
		 * Obtains an instance of Time from a LocalTime object with
		 * the same hour, minute and second time value as the given
		 * LocalTime.
		 * 
		 * Parameters:
		 * 
		 * time - a LocalTime to convert
		 * 
		 * Returns:
		 * 
		 * a Time object
		 */
		Time time = Time.valueOf(localTime);
		System.out.println("time = " + time);

	}

}
