import java.util.Calendar;

public class CalendarDemo3
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();

		System.out.println("Before set = " + cal.getTime());

		/*
		 * Parameters:
		 * 
		 * year - the value used to set the YEAR calendar field.
		 * 
		 * month - the value used to set the MONTH calendar field.
		 * Month value is 0-based. e.g., 0 for January.
		 * 
		 * date - the value used to set the DAY_OF_MONTH calendar
		 * field.
		 * 
		 * hourOfDay - the value used to set the HOUR_OF_DAY calendar
		 * field.
		 * 
		 * minute - the value used to set the MINUTE calendar field.
		 * 
		 * second - the value used to set the SECOND calendar field.
		 */
		cal.set(2000, 11, 15, 2, 30, 10);

		// print the result
		System.out.println("After set  = " + cal.getTime());
	}

}
