import java.sql.Time;

public class TimeDemo
{

	public static void main(String[] args)
	{

		Time time = Time.valueOf("15:06:00");
		System.out.println("Before setTime = " + time);

		/*
		 * Sets a Time object using a milliseconds time value.
		 */
		time.setTime(System.currentTimeMillis());
		System.out.println("After setTime  = " + time);

	}

}
