import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class LocalDateDemo
{

	public static void main(String[] args)
	{
		LocalDate date = LocalDate.parse("2017-11-23");
		System.out.println(date);

		/*
		 * Parameters: 
		 * 
		 * field - the field to get, not null
		 * 
		 * Returns:
		 * 
		 * the value for the field
		 */
		
		int year = date.get(ChronoField.YEAR);
		System.out.println("year = "+year);
		
		int month = date.get(ChronoField.MONTH_OF_YEAR);
		System.out.println("month of year = "+month);
		
		int dayOfTheMonth = date.get(ChronoField.DAY_OF_MONTH);
		System.out.println("dayOfTheMonth = "+dayOfTheMonth);
		
		
	}

}
