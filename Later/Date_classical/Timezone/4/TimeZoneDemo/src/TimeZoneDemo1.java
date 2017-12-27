import java.util.TimeZone;

public class TimeZoneDemo1
{
	public static void main(String[] args)
	{
		TimeZone timezone = TimeZone.getTimeZone("Europe/Paris");

		/*
		 * Returns:
		 * 
		 * the amount of saving time in milliseconds
		 */
		System.out.println("DST saving is = " + timezone.getDSTSavings());
	}
}
