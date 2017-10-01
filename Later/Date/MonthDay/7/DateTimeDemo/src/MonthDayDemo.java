import java.time.MonthDay;

public class MonthDayDemo
{

	public static void main(String[] args)
	{
		MonthDay date = MonthDay.parse("--02-29");

		/*
		 * Parameters:
		 * 
		 * year - the year to validate
		 * 
		 * Returns:true if the year is valid for this month-day
		 */
		boolean isYearValid = date.isValidYear(2000);
		System.out.println("is --02-29 valid for the year 2000 ? = "+isYearValid);

		isYearValid = date.isValidYear(2017);
		System.out.println("is --02-29 valid for the year 2017 ? = "+isYearValid);

	}

}
