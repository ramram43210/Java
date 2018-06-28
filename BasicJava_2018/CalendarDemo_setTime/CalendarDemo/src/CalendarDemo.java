import java.util.Calendar;
import java.util.Date;

public class CalendarDemo
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();		
		cal.set(2013,3,10);
		System.out.println("Before setting Time = " + cal.getTime());

		Date date = new Date();
		
		/*
		 * Parameters:
		 * 
		 * date - the given Date.
		 */
		cal.setTime(date);

		System.out.println("After setting Time  = " + cal.getTime());
	}
}
