import java.sql.Time;
import java.time.Instant;

public class TimeDemo
{

	public static void main(String[] args)
	{

		Time time = Time.valueOf("15:06:00");

		/*
		 * This method always throws an UnsupportedOperationException
		 * and should not be used because SQL Time values do not have
		 * a date component.
		 */
		Instant instant = time.toInstant();
		System.out.println(instant);

	}

}
