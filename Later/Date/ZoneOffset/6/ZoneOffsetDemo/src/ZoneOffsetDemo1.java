import java.time.ZoneOffset;

public class ZoneOffsetDemo1
{

	public static void main(String[] args)
	{
		ZoneOffset zoneOffset1 = ZoneOffset.ofHours(2);
		ZoneOffset zoneOffset2 = ZoneOffset.ofHours(1);
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
	}

}
