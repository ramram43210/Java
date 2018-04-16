import java.time.Month;

public class MonthDemo
{
	public static void main(String[] args)
	{
		Month month = Month.of(6);
		System.out.println("month = "+month);
		
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
