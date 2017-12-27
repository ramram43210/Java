import java.util.TimeZone;

public class TimeZoneDemo2
{
	public static void main(String[] args)
	{
		TimeZone timezone = TimeZone.getTimeZone("Europe/Paris");

		/*
		 * Returns:the ID of this time zone.
		 */
		System.out.println("ID value is = " + timezone.getID());
	}
}
