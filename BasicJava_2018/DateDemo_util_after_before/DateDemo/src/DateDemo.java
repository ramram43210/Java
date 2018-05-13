import java.util.Calendar;
import java.util.Date;

public class DateDemo
{
	public static void main(String[] args)
	{
		Date date1 = Calendar.getInstance().getTime();
		System.out.println("date1 = " + date1);
		 
	    Calendar cal = Calendar.getInstance();
	    cal.set(Calendar.YEAR, 2000);
	    Date date2 = cal.getTime();
	    System.out.println("date2 = " + date2);

		/*
		 * Parameters:
		 * 
		 * when - a date.
		 * 
		 * Returns:
		 * 
		 * true if and only if the instant represented by this Date
		 * object is strictly later than the instant represented by
		 * when; false otherwise.
		 */
	    System.out.println("Is date1 after date2 ? : " + date1.after(date2)); 
	    
		/*
		 * Parameters:
		 * 
		 * when - a date.
		 * 
		 * Returns:
		 * 
		 * true if and only if the instant of time represented by this
		 * Date object is strictly earlier than the instant
		 * represented by when; false otherwise.
		 */
	    System.out.println("Is date1 before date2 ? : " + date1.before(date2)); 
	}

}
