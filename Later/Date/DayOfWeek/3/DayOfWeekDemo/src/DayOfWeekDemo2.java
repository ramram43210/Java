import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class DayOfWeekDemo2
{
	public static void main(String[] args)
	{

		LocalDate localDate = LocalDate.of(2014, Month.JUNE, 21);
		
		/*
		 * Parameters:
		 * 
		 * temporal - the temporal object to convert, not null
		 * 
		 * Returns:
		 * 
		 * the day-of-week, not null
		 */
	    DayOfWeek dayOfWeek = DayOfWeek.from(localDate);
	    System.out.println("Name = "+dayOfWeek.name());
		System.out.println("Value = "+dayOfWeek.getValue());
		System.out.println("Ordinal = "+dayOfWeek.ordinal());


	}

}
