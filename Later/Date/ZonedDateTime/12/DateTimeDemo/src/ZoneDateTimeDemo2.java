import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeDemo2
{

	public static void main(String[] args)
	{

		LocalDate localDate = LocalDate.parse("2017-02-03");
		LocalTime localTime = LocalTime.parse("12:30:30");

		/*
		 * Parameters:
		 * 
		 * date - the local date, not null
		 * 
		 * time - the local time, not null
		 * 
		 * zone - the time-zone, not null
		 * 
		 * Returns:
		 * 
		 * the offset date-time, not null
		 * 
		 */
		
		ZonedDateTime zonedDateTime = ZonedDateTime.of(localDate, localTime,ZoneId.systemDefault());
		System.out.println(zonedDateTime);

	}

}
