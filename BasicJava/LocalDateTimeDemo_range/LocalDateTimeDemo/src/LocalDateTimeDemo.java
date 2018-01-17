import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

public class LocalDateTimeDemo
{

	public static void main(String[] args)
	{
		LocalDateTime localDateTime = LocalDateTime
				.parse("2018-12-03T10:15:30");

		/*
		 * Parameters:
		 * 
		 * field - the field to query the range for, not null
		 * 
		 * Returns:
		 * 
		 * the range of valid values for the field, not null
		 */
		ValueRange valueRange = localDateTime.range(ChronoField.DAY_OF_YEAR);

		System.out.println("Range : " + valueRange);
		System.out.println("Min : " + valueRange.getMinimum());
		System.out.println("Max : " + valueRange.getMaximum());

		System.out.println("--------------------------------");

		valueRange = localDateTime.range(ChronoField.MONTH_OF_YEAR);

		System.out.println("Range : " + valueRange);
		System.out.println("Min : " + valueRange.getMinimum());
		System.out.println("Max : " + valueRange.getMaximum());
	}

}
