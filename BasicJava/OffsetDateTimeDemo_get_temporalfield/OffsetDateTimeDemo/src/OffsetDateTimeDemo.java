import java.time.OffsetDateTime;
import java.time.temporal.ChronoField;

public class OffsetDateTimeDemo
{

	public static void main(String[] args)
	{

		OffsetDateTime offsetDateTime = OffsetDateTime.now();
		System.out.println(offsetDateTime);

		/*
		 * Parameters:
		 * 
		 * field - the field to get, not null
		 * 
		 * Returns:
		 * 
		 * the value for the field
		 */
		int dayOfMonth = offsetDateTime.get(ChronoField.DAY_OF_MONTH);
		System.out.println("dayOfMonth = " + dayOfMonth);
		
		int monthOfYear = offsetDateTime.get(ChronoField.MONTH_OF_YEAR);
		System.out.println("monthOfYear = " + monthOfYear);

	}

}
