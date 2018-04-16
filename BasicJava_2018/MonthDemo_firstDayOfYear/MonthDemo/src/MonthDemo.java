import java.time.Month;

public class MonthDemo
{
	public static void main(String[] args)
	{
		Month month = Month.of(2);
		System.out.println("month = "+month);
		
		/*
		 * Parameters:
		 * 
		 * leapYear - true if the length is required for a leap year
		 * 
		 * Returns:
		 * 
		 * the day of year corresponding to the first day of this
		 * month, from 1 to 336
		 */
		int firstDayOfYear = month.firstDayOfYear(false);		
	    System.out.println("firstDayOfYear =  "+firstDayOfYear);  
	}

}
