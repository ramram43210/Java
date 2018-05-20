import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
/**
 * public Map<String,Integer> getDisplayNames(int field, int
 * 												style, Locale locale)
 *  
 * Parameters:
 * 
 * field - the calendar field for which the display names are
 * returned
 * 
 * style - the style applied to the string representation; one
 * of SHORT_FORMAT (SHORT), SHORT_STANDALONE, LONG_FORMAT
 * (LONG), LONG_STANDALONE, NARROW_FORMAT, or
 * NARROW_STANDALONE
 * 
 * locale - the locale for the display names
 * 
 * Returns:
 * 
 * a Map containing all display names in style and locale and
 * their field values, or null if no display names are defined
 * for field
 */
public class CalendarDemo
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();
		Locale locale = Locale.getDefault();
		System.out.println(locale);
		Map<String, Integer> map = cal.getDisplayNames(Calendar.DAY_OF_WEEK,
				Calendar.LONG, locale);
		System.out.println(map);

	}

}
