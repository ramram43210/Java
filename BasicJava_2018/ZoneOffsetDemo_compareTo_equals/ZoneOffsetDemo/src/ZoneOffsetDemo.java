import java.time.ZoneOffset;

public class ZoneOffsetDemo
{

	public static void main(String[] args)
	{
		ZoneOffset zoneOffset1 = ZoneOffset.ofHours(2);
		System.out.println("zoneOffset1 = " + zoneOffset1);
		ZoneOffset zoneOffset2 = ZoneOffset.ofHours(1);
		System.out.println("zoneOffset2 = " + zoneOffset2);
		/*
		 * Parameters:
		 * 
		 * other - the other date to compare to, not null
		 * 
		 * Returns:
		 * 
		 * the comparator value, negative if less, positive if greater
		 */
		int value = zoneOffset1.compareTo(zoneOffset2);
		System.out.println(value);

		/*
		 * Parameters:
		 * 
		 * obj - the object to check, null returns false
		 * 
		 * Returns:
		 * 
		 * true if this is equal to the other offset
		 */
		boolean isEqual = zoneOffset1.equals(zoneOffset2);
		System.out.println(isEqual);
	}

}
