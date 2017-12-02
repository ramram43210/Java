import java.time.Month;

public class MonthDemo2
{
	public static void main(String[] args)
	{
		Month month = Month.of(3);
		
		/*
		 * Returns:
		 * 
		 * the first month of the quarter corresponding to this month,
		 * not null
		 */
		Month firstMonthOfQuarter = month.firstMonthOfQuarter();
		System.out.println("firstMonthOfQuarter = "+firstMonthOfQuarter);
	}

}
