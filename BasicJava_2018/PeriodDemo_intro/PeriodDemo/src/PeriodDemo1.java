import java.time.Period;

public class PeriodDemo1
{

	public static void main(String[] args)
	{
		/*
		 * Parameters:
		 * 
		 * years - the amount of years, may be negative
		 * 
		 * months - the amount of months, may be negative
		 * 
		 * days - the amount of days, may be negative
		 * 
		 * Returns:
		 * 
		 * the period of years, months and days, not null
		 */
		Period period = Period.of(2017, 02, 16);
		System.out.println("period = " + period);

		/*
		 * Returns: the amount of years of this period, may be
		 * negative
		 */
		System.out.println("Years = " + period.getYears());

		/*
		 * Returns: the amount of months of this period, may be
		 * negative
		 */
		System.out.println("Months = " + period.getMonths());

		/*
		 * Returns: the amount of days of this period, may be negative
		 */
		System.out.println("Days = " + period.getDays());
	}

}
