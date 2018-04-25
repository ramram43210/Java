import java.time.Month;

public class MonthDemo2
{
	public static void main(String[] args)
	{
		Month month = Month.of(2);
		System.out.println("Before plus, Month = "+month);

		/*
		 * Parameters:
		 * 
		 * months - the months to add, positive or negative
		 * 
		 * Returns:
		 * 
		 * the resulting month, not null
		 */
		month = month.plus(1);
		System.out.println("Before plus, Month = "+month);
	}

}
