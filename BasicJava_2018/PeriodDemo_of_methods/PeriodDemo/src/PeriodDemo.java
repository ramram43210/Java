import java.time.Period;

public class PeriodDemo
{

	public static void main(String[] args)
	{
		/*
		 * Parameters:
		 * 
		 * days - the number of days, positive or negative
		 * 
		 * Returns:
		 * 
		 * the period of days, not null
		 */
		Period periodOfDays = Period.ofDays(12);
		System.out.println("periodOfDays = " + periodOfDays);

		/*
		 * Parameters:
		 * 
		 * months - the number of months, positive or negative
		 * 
		 * Returns:
		 * 
		 * the period of months, not null
		 */
		Period periodOfMonth = Period.ofMonths(12);
		System.out.println("periodOfMonth = " + periodOfMonth);

		/*
		 * Parameters:
		 * 
		 * years - the number of years, positive or negative
		 * 
		 * Returns:
		 * 
		 * the period of years, not null
		 */
		Period periodOfYears = Period.ofYears(2017);
		System.out.println("periodOfYears = " + periodOfYears);

		/*
		 * Parameters:
		 * 
		 * weeks - the number of weeks, positive or negative
		 * 
		 * Returns:
		 * 
		 * the period, with the input weeks converted to days, not
		 * null
		 */
		Period periodWeekToDays = Period.ofWeeks(2);
		System.out.println("periodWeekToDays = " + periodWeekToDays);

	}

}
