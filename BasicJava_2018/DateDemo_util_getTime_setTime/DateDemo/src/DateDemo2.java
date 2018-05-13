import java.util.Date;

public class DateDemo2
{
	public static void main(String[] args)
	{
		Date date = new Date();
		System.out.println("Date before setting =  " + date);

		/*
		 * Sets this Date object to represent a point in time that is
		 * time milliseconds after January 1, 1970 00:00:00 GMT.
		 * 
		 * Parameters:
		 * 
		 * time - the number of milliseconds.
		 */
		date.setTime(200000);

		System.out.println("Date after setting  =  " + date);

	}

}
