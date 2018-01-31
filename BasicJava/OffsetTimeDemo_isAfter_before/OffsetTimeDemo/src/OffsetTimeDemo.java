import java.time.OffsetTime;

public class OffsetTimeDemo
{

	public static void main(String[] args)
	{

		OffsetTime offsetTime1 = OffsetTime.parse("10:30:30+05:30");
		System.out.println("offsetTime1 = " + offsetTime1);

		OffsetTime offsetTime2 = OffsetTime.parse("12:30:30+05:30");
		System.out.println("offsetTime2 = " + offsetTime2);

		/*
		 * Returns:true if this is equal to the other time
		 */
		System.out.println(offsetTime1.equals(offsetTime2));

		/*
		 * Returns:true if this is after the instant of the specified
		 * time
		 */
		System.out.println(offsetTime1.isAfter(offsetTime2));

		/*
		 * Returns:true if this is before the instant of the specified
		 * time
		 */

		System.out.println(offsetTime1.isBefore(offsetTime2));

	}

}
