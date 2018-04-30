import java.time.DayOfWeek;
import java.time.LocalDate;

public class DayOfWeekDemo
{
	public static void main(String[] args)
	{

		LocalDate localDate = LocalDate.now();
		System.out.println("localDate = "+localDate);
		
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
	    System.out.println("dayOfWeek = "+dayOfWeek);
	}

}
