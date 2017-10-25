import java.time.ZoneOffset;

public class ZoneOffsetDemo2
{

	public static void main(String[] args)
	{
		ZoneOffset zoneOffset1 = ZoneOffset.ofHours(2);
		ZoneOffset zoneOffset2 = ZoneOffset.ofHours(1);
		/*
		 * Parameters:
		 * 
		 * obj - the object to check, null returns false
		 * 
		 * Returns:
		 * 
		 * true if this is equal to the other offset
		 */
		boolean value = zoneOffset1.equals(zoneOffset2);
		System.out.println(value);
	}

}
