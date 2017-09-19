import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeDemo
{

	public static void main(String[] args)
	{
		LocalDateTime localDateTime1 = LocalDateTime.parse("2018-02-03T12:30:30");
		System.out.println("localDateTime1 = "+localDateTime1);
		
		/*
		 * Parameters:
		 * 
		 * amountToAdd - the amount of the unit to add to the result,
		 * may be negative
		 * 
		 * unit - the unit of the amount to add, not null
		 * 
		 * Returns:a LocalDateTime based on this date-time with the
		 * specified amount added, not null
		 */
		LocalDateTime localDateTime2 = localDateTime1.plus(5, ChronoUnit.MONTHS);
	    System.out.println("Month Added    = "+localDateTime2);
	    
		/*
		 * Parameters:
		 * 
		 * amountToSubtract - the amount of the unit to subtract from
		 * the result, may be negative
		 * 
		 * unit - the unit of the amount to subtract, not null
		 * 
		 * Returns:a LocalDateTime based on this date-time with the
		 * specified amount subtracted, not null
		 */
	    
	    LocalDateTime localDateTime3 = localDateTime1.minus(5,ChronoUnit.YEARS);
	    System.out.println("Years reduced  = "+localDateTime3);
	}

}
