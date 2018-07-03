import java.util.Calendar;

public class CalendarDemo
{
	public static void main(String[] args)
	{
		Calendar cal1 = Calendar.getInstance();
		System.out.println("Current date = " + cal1.getTime());
		
		Calendar cal2 = Calendar.getInstance();
		cal2.set(Calendar.YEAR, 2030);
		System.out.println("future date  = " + cal2.getTime());

		/*
		 * Parameters:
		 * 
		 * when - the Object to be compared
		 * 
		 * Returns:
		 * 
		 * true if the time of this Calendar is before the time
		 * represented by when; false otherwise.
		 */
		boolean isBefore = cal1.before(cal2);
		System.out.println("is cal1 before cal2 = " + isBefore);

		/*
		 * Parameters:
		 * 
		 * when - the Object to be compared
		 * 
		 * Returns:
		 * 
		 * true if the time of this Calendar is after the time
		 * represented by when; false otherwise.
		 */
		boolean isAfter = cal1.after(cal2);
		System.out.println("is cal1 After  cal2 = " + isAfter);

	}
}
