import java.util.Calendar;

public class CalendarDemo1
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
		 */
		cal.set(2000, 11, 14);

		// print the result
		System.out.println("After set  = " + cal.getTime());
	}
}
