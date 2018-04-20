import java.time.Month;
import java.time.ZonedDateTime;

/**
 * Temporal java.time.Month.adjustInto(Temporal temporal)
 *  
 * Adjusts the specified temporal object to have this month-of-year.
 * 
 * Parameters:
 * 
 * temporal - the target object to be adjusted, not null
 * 
 * Returns:
 * 
 * the adjusted object, not null
 * 
 */
public class MonthDemo
{
	public static void main(String[] args)
	{
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println("zonedDateTime = " + zonedDateTime);

		Month month = Month.of(2);
		System.out.println("month = " + month);

		zonedDateTime = (ZonedDateTime) month.adjustInto(zonedDateTime);
		System.out.println(zonedDateTime);
	}

}
