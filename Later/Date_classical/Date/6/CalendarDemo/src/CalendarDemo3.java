import java.util.Calendar;
import java.util.Locale;
import java.util.Map;

public class CalendarDemo3
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();
	    Locale locale = Locale.getDefault();

		/*
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
	    Map<String, Integer> map = cal.getDisplayNames(Calendar.DAY_OF_WEEK, Calendar.LONG, locale);
	    
	    System.out.println(map);

	}

}
