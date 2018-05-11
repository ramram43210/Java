import java.util.Date;

public class DateDemo2
{
	public static void main(String[] args)
	{
		/*
		 * Returns the current time in milliseconds. 
		 */
		long millis = System.currentTimeMillis();
		Date date = new Date(millis);
		System.out.println(date);
	}

}
