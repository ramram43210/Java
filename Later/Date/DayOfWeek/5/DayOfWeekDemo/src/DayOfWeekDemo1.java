import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class DayOfWeekDemo1
{
	public static void main(String[] args)
	{
		LocalDate localDate = LocalDate.of(2017, Month.JUNE, 27);
	    DayOfWeek dayOfWeek = DayOfWeek.from(localDate);
	    
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
