import java.util.TimeZone;

public class TimeZoneDemo1
{
	public static void main(String[] args)
	{
		/*
		 * Returns:an array of IDs.
		 */
		String[] idArray = TimeZone.getAvailableIDs();
		for (String id : idArray)
		{
			System.out.println(id);
		}
	}
}
