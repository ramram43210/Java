import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class MonthDemo
{
	public static void main(String[] args)
	{
		Month month = Month.of(3);

		/*
		 * Gets the textual representation, such as 'Jan' or
		 * 'December'.
		 * 
		 * Parameters:
		 * 
		 * style - the length of the text required, not null
		 * 
		 * locale - the locale to use, not null
		 * 
		 * Returns:
		 * 
		 * the text value of the month-of-year, not null
		 */
		System.out
				.println(month.getDisplayName(TextStyle.FULL, Locale.ENGLISH));
		System.out
				.println(month.getDisplayName(TextStyle.SHORT, Locale.ENGLISH));
		System.out.println(
				month.getDisplayName(TextStyle.NARROW, Locale.ENGLISH));
	}

}
