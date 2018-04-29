import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;

public class DayOfWeekDemo
{
	public static void main(String[] args)
	{
		DayOfWeek dayOfWeek = DayOfWeek.TUESDAY;

		/*
		 * Gets the textual representation, such as 'Mon' or 'Friday'. 
		 * 
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
		System.out.println("Full   = "+dayOfWeek.getDisplayName(TextStyle.FULL, Locale.US));
		System.out
				.println("Short  = "+dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.US));
		System.out
				.println("Narrow =  "+dayOfWeek.getDisplayName(TextStyle.NARROW, Locale.US));
	}

}
