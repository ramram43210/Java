import java.time.Month;

public class MonthDemo1
{
	public static void main(String[] args)
	{
		Month month = Month.of(2);
		System.out.println("Before minus, Month = "+month);
		
		/*
		 * Parameters:
		 * 
		 * months - the months to subtract, positive or negative
		 * 
		 * Returns:
		 * 
		 * the resulting month, not null
		 */
		month = month.minus(1);
		System.out.println("After minus, Month  = "+month);
	}

}
