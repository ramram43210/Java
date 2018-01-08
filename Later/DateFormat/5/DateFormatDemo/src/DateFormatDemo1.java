import java.text.SimpleDateFormat;
import java.util.Locale;

public class DateFormatDemo1
{
	public static void main(String[] args)
	{
		/*
		 * Returns:
		 * 
		 * An array of locales for which localized DateFormat
		 * instances are available.
		 */
		Locale[] localeArray = SimpleDateFormat.getAvailableLocales();
		
		for (Locale locale : localeArray)
		{
			System.out.println(locale.getDisplayName());
		}

	}

}
