import java.time.ZoneOffset;

public class ZoneOffsetDemo
{

	public static void main(String[] args)
	{

		/*
		 * Constant for the minimum supported offset.
		 */
		ZoneOffset zoneOffsetMin = ZoneOffset.MIN;
		System.out.println("zoneOffsetMin = " + zoneOffsetMin);

		/*
		 * Constant for the maximum supported offset.
		 */
		ZoneOffset zoneOffsetMax = ZoneOffset.MAX;
		System.out.println("zoneOffsetMax = " + zoneOffsetMax);

		/*
		 * The time-zone offset for UTC, with an ID of 'Z'.
		 */
		ZoneOffset zoneOffsetUtc = ZoneOffset.UTC;
		System.out.println("zoneOffsetUtc = " + zoneOffsetUtc);
	}

}
