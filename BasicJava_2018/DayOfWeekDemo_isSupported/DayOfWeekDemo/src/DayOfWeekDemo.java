import java.time.DayOfWeek;
import java.time.temporal.ChronoField;

public class DayOfWeekDemo
{
	public static void main(String[] args)
	{
		DayOfWeek dayOfWeek = DayOfWeek.MONDAY;
	    
		/*
		 * Parameters:
		 * 
		 * field - the field to check, null returns false
		 * 
		 * Returns:
		 * 
		 * true if the field is supported on this day-of-week, false
		 * if not
		 */
	    boolean isSupported= dayOfWeek.isSupported(ChronoField.DAY_OF_YEAR);	    
	    System.out.println(isSupported);
	    
	    isSupported= dayOfWeek.isSupported(ChronoField.DAY_OF_WEEK);	    
	    System.out.println(isSupported);
	}

}
