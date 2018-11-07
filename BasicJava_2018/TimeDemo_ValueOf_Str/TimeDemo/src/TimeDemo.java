import java.sql.Time;

public class TimeDemo
{

	public static void main(String[] args)
	{

		/*
		 * Converts a string in JDBC time escape format to a Time
		 * value.
		 * 
		 * Parameters:
		 * 
		 * s - time in format "hh:mm:ss"
		 * 
		 * Returns:
		 * 
		 * a corresponding Time object
		 */
		Time time = Time.valueOf("15:06:00");
		System.out.println(time);

	}

}
