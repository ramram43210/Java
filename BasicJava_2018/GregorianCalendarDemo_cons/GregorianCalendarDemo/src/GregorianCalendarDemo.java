import java.util.GregorianCalendar;

public class GregorianCalendarDemo
{
	public static void main(String[] args)
	{
		/*
		 * Parameters:
		 * 
		 * year - the value used to set the YEAR calendar field in the
		 * calendar.
		 * 
		 * month - the value used to set the MONTH calendar field in
		 * the calendar. Month value is 0-based. e.g., 0 for January.
		 * 
		 * dayOfMonth - the value used to set the DAY_OF_MONTH
		 * calendar field in the calendar.
		 */
		GregorianCalendar cal1 = new GregorianCalendar(2017, 10, 21);
		System.out.println(cal1.getTime());
		
		
		/*
		 * Parameters:
		 * 
		 * year - the value used to set the YEAR calendar field in the
		 * calendar.
		 * 
		 * month - the value used to set the MONTH calendar field in
		 * the calendar. Month value is 0-based. e.g., 0 for January.
		 * 
		 * dayOfMonth - the value used to set the DAY_OF_MONTH
		 * calendar field in the calendar.
		 * 
		 * hourOfDay - the value used to set the HOUR_OF_DAY calendar
		 * field in the calendar.
		 * 
		 * minute - the value used to set the MINUTE calendar field in
		 * the calendar.
		 */
		GregorianCalendar cal2 = new GregorianCalendar(2017, 2, 9, 22, 23);
		System.out.println(cal2.getTime());
	    
		/*
		 * Parameters:
		 * 
		 * year - the value used to set the YEAR calendar field in the
		 * calendar.
		 * 
		 * month - the value used to set the MONTH calendar field in
		 * the calendar. Month value is 0-based. e.g., 0 for January.
		 * 
		 * dayOfMonth - the value used to set the DAY_OF_MONTH
		 * calendar field in the calendar.
		 * 
		 * hourOfDay - the value used to set the HOUR_OF_DAY calendar
		 * field in the calendar.
		 * 
		 * minute - the value used to set the MINUTE calendar field in
		 * the calendar.
		 * 
		 * second - the value used to set the SECOND calendar field in
		 * the calendar.
		 */
		GregorianCalendar cal3 = new GregorianCalendar(2017,2,9,40,43,52);
	    System.out.println(cal3.getTime());
	}
}
