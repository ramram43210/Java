import java.time.ZoneId;
import java.time.format.TextStyle;
import java.util.Locale;

public class ZoneIdDemo
{

	public static void main(String[] args)
	{
		ZoneId zoneId = ZoneId.systemDefault();

		/*
		 * Parameters:
		 * 
		 * style - the length of the text required, not null
		 * 
		 * locale - the locale to use, not null
		 * 
		 * Returns: the text value of the zone, not null
		 */
		String displayName = zoneId.getDisplayName(TextStyle.FULL,Locale.US);
		System.out.println("displayName = " + displayName);
	}

}
