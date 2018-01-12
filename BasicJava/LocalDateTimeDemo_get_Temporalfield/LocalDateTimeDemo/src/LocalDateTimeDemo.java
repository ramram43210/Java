import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class LocalDateTimeDemo
{

	public static void main(String[] args)
	{
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println(currentDateTime);

		/*
		 * Parameters:
		 * 
		 * field - the field to get, not null
		 * 
		 * Returns:
		 * 
		 * the value for the field
		 * 
		 */
		System.out.println("DAY_OF_WEEK = "
				+ currentDateTime.get(ChronoField.DAY_OF_WEEK));

		System.out.println("DAY_OF_YEAR = "
				+ currentDateTime.get(ChronoField.DAY_OF_YEAR));

		System.out.println("DAY_OF_MONTH = "
				+ currentDateTime.get(ChronoField.DAY_OF_MONTH));

		System.out.println("HOUR_OF_DAY = "
				+ currentDateTime.get(ChronoField.HOUR_OF_DAY));

		System.out.println("MINUTE_OF_DAY = "
				+ currentDateTime.get(ChronoField.MINUTE_OF_DAY));
	}

}
