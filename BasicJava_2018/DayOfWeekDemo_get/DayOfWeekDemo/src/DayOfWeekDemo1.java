import java.time.DayOfWeek;
import java.time.temporal.ChronoField;

public class DayOfWeekDemo1
{
	public static void main(String[] args)
	{
	    DayOfWeek dayOfWeek = DayOfWeek.TUESDAY;
	    System.out.println("dayOfWeek = "+dayOfWeek);
	    
		/*
		 * Parameters:
		 * 
		 * field - the field to get, not null
		 * 
		 * Returns:
		 * 
		 * the value for the field
		 */
	    long value = dayOfWeek.getLong(ChronoField.DAY_OF_WEEK);	    
	    System.out.println(value);
	}

}
