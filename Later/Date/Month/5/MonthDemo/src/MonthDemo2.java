import java.time.Month;
import java.time.ZonedDateTime;

public class MonthDemo2
{
	public static void main(String[] args)
	{
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println(zonedDateTime);

		Month month = Month.of(2);

		/*
		 * Parameters:
		 * 
		 * temporal - the target object to be adjusted, not null
		 * 
		 * Returns:
		 * 
		 * the adjusted object, not null
		 */
		zonedDateTime = (ZonedDateTime) month.adjustInto(zonedDateTime);
		System.out.println(zonedDateTime);
	}

}
