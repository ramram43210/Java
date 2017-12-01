import java.util.Date;

public class DateDemo1
{
	public static void main(String[] args)
	{
		Date date = new Date();

		/*
		 * Returns:
		 * 
		 * the number of milliseconds since January 1, 1970, 00:00:00
		 * GMT represented by this date.
		 */
		long milliSec = date.getTime();
		System.out.println(milliSec);

	}

}
