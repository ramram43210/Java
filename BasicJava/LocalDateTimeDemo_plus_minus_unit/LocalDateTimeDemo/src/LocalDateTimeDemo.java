import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeDemo
{

	public static void main(String[] args)
	{
		LocalDateTime currentDatetime = LocalDateTime.now();
		System.out.println("currentDatetime= " + currentDatetime);

		/*
		 * Parameters:
		 * 
		 * amountToAdd - the amount of the unit to add to the result,
		 * may be negative
		 * 
		 * unit - the unit of the amount to add, not null
		 * 
		 * Returns:
		 * 
		 * a LocalDateTime based on this date-time with the specified
		 * amount added, not null
		 */
		LocalDateTime localDateTime2 = currentDatetime.plus(5,
				ChronoUnit.MONTHS);
		System.out.println("Month Added    = " + localDateTime2);

		/*
		 * Parameters:
		 * 
		 * amountToSubtract - the amount of the unit to subtract from
		 * the result, may be negative
		 * 
		 * unit - the unit of the amount to subtract, not null
		 * 
		 * Returns:
		 * 
		 * a LocalDateTime based on this date-time with the specified
		 * amount subtracted, not null
		 */

		LocalDateTime localDateTime3 = currentDatetime.minus(5,
				ChronoUnit.YEARS);
		System.out.println("Years reduced  = " + localDateTime3);
	}

}
