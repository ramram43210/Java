import java.sql.Time;

public class TimeDemo
{

	public static void main(String[] args)
	{

		long millis = System.currentTimeMillis();

		/*
		 * Constructs a Time object using a milliseconds time value.
		 */
		Time time = new Time(millis);
		System.out.println(time);
	}

}
