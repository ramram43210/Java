import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.OffsetTime;

public class OffsetTimeDemo
{

	public static void main(String[] args)
	{

		OffsetTime offsetTime = OffsetTime.parse("10:30:30+05:30");
		System.out.println("offsetTime = " + offsetTime);

		LocalDate localDate = LocalDate.now();
		System.out.println("localDate = " + localDate);

		/*
		 * Combines this time with a date to create an OffsetDateTime.
		 * 
		 * Parameters:
		 * 
		 * date - the date to combine with, not null
		 * 
		 * Returns:
		 * 
		 * the offset date-time formed from this time and the
		 * specified date, not null
		 */
		OffsetDateTime offsetDateTime = offsetTime.atDate(localDate);
		System.out.println("offsetDateTime = " + offsetDateTime);
	}

}
