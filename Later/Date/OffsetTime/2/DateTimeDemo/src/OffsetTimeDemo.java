import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.OffsetTime;

public class OffsetTimeDemo
{

	public static void main(String[] args)
	{
		LocalDate localDate = LocalDate.now();
		System.out.println("localDate = " + localDate);

		OffsetTime offsetTime = OffsetTime.parse("10:30:30+05:30");
		System.out.println("offsetTime = " + offsetTime);

		/*
		 * Parameters:
		 * 
		 * date - the date to combine with, not null
		 * 
		 * Returns:the offset date-time formed from this time and the
		 * specified date, not null
		 */
		OffsetDateTime offsetDateTime = offsetTime.atDate(localDate);
		System.out.println("offsetDateTime = " + offsetDateTime);
	}

}
