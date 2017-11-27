import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class DayOfWeekDemo1
{
	public static void main(String[] args)
	{
		LocalDate localDate = LocalDate.of(2017, Month.JUNE, 15);
	    DayOfWeek dayOfWeek = DayOfWeek.from(localDate);
	    
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
