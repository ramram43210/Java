import java.util.Calendar;
import java.util.Locale;

public class CalendarDemo1
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();
		Locale locale = Locale.getDefault();

		String displayName = cal.getDisplayName(Calendar.DAY_OF_WEEK,
				Calendar.SHORT, locale);
		
		System.out.println("SHORT = " + displayName);

		displayName = cal.getDisplayName(Calendar.DAY_OF_WEEK,
				Calendar.LONG, locale);
		
		System.out.println("LONG  = " + displayName);

	}
}
