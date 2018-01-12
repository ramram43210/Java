import java.time.LocalTime;

public class LocalTimeDemo1
{

	public static void main(String[] args)
	{
		LocalTime time1 = LocalTime.parse("05:30:30");
		System.out.println(time1);

		LocalTime time2 = LocalTime.parse("06:35:30");
		System.out.println(time2);

		/*
		 * Parameters:
		 * 
		 * other - the other time to compare to, not null
		 * 
		 * Returns:the comparator value, negative if less, positive if
		 * greater
		 */

		int value = time1.compareTo(time2);

		System.out.println(value);
	}

}
