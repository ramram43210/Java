import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class DayOfWeekDemo1
{
	public static void main(String[] args)
	{
		 LocalDate localDate = LocalDate.of(2017, Month.JUNE, 21);
		 DayOfWeek dayOfWeek = DayOfWeek.from(localDate);
		 
		 /*
		  * Parameters:
		  * 
		  * style - the length of the text required, not null
		  * 
		  * locale - the locale to use, not null
		  * 
		  * Returns:
		  * 
		  * the text value of the day-of-week, not null
		  */
		 System.out.println(dayOfWeek.getDisplayName(TextStyle.FULL, Locale.US));
		 System.out.println(dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.US));
		 System.out.println(dayOfWeek.getDisplayName(TextStyle.NARROW, Locale.US ));
	}

}
