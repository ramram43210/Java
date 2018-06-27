import java.util.Calendar;

public class CalendarDemo
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();

		System.out.println("Current year is = " + cal.get(Calendar.YEAR));
		System.out.println("Current Month is = " + cal.get(Calendar.MONTH));
		
		/*
		 * Parameters:
		 * 
		 * field - the given calendar field.
		 * 
		 * value - the value to be set for the given calendar field.
		 */
		
		cal.set(Calendar.YEAR, 2013);
		cal.set(Calendar.MONTH, 5);

		System.out.println("\nAltered year is = " + cal.get(Calendar.YEAR));
		System.out.println("Altered Month is = " + cal.get(Calendar.MONTH));
	}
}
