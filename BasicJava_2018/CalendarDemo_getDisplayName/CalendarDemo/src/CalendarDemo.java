import java.util.Calendar;
import java.util.Locale;

/**
 * public String getDisplayName(int field, int style, Locale locale)
 * 
 * Returns the string representation of the calendar field value in
 * the given style and locale.
 * 
 * Parameters:
 * 
 * field - the calendar field for which the string representation is
 * returned
 * 
 * style - the style applied to the string representation; one of
 * SHORT_FORMAT (SHORT), SHORT_STANDALONE, LONG_FORMAT (LONG),
 * LONG_STANDALONE, NARROW_FORMAT, or NARROW_STANDALONE.
 * 
 * locale - the locale for the string representation (any calendar
 * types specified by locale are ignored)
 * 
 * Returns:
 * 
 * the string representation of the given field in the given style, or
 * null if no string representation is applicable.
 */
public class CalendarDemo
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();
		Locale locale = Locale.getDefault();
		System.out.println("locale = " + locale);

		String displayName = cal.getDisplayName(Calendar.DAY_OF_WEEK,
				Calendar.LONG, locale);
		System.out.println("Long format = " + displayName);

		displayName = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT,
				locale);
		System.out.println("Short format = " + displayName);

	}
}
