import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodDemo2
{
	public static void main(String[] args)
	{
		LocalDate localDate1 = LocalDate.of(2010, Month.JANUARY, 21);
		System.out.println("localDate1 = "+localDate1);
		
		LocalDate localDate2 = LocalDate.of(2025, Month.JANUARY, 21);
		System.out.println("localDate2 = "+localDate2);
		
		/*
		 * Parameters:
		 * 
		 * startDateInclusive - the start date, inclusive, not null
		 * endDateExclusive - the end date, exclusive, not null
		 * 
		 * Returns:
		 * 
		 * the period between this date and the end date, not null
		 */
		Period period = Period.between(localDate1,localDate2);
	    System.out.println("period = "+ period);
	}

}
