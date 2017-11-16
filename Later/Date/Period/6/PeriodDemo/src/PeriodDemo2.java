import java.time.Period;

public class PeriodDemo2
{
	public static void main(String[] args)
	{
		Period period1 = Period.ofDays(12);
		Period period2 = Period.ofDays(12);
		/*
		 * Parameters:
		 * 
		 * obj - the object to check, null returns false
		 * 
		 * Returns:
		 * 
		 * true if this is equal to the other period
		 */
		boolean isEqual = period1.equals(period2);
		System.out.println("isEqual = " + isEqual);
	}

}
