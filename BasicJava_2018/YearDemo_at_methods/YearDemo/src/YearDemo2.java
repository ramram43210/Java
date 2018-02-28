import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;

public class YearDemo2
{

	public static void main(String[] args)
	{
		Year year = Year.of(2017);
		System.out.println("year = "+year);

		MonthDay monthDay = MonthDay.of(Month.MARCH, 29);
		System.out.println("monthDay = "+monthDay);
		
		/*
		 * Parameters:
		 * 
		 * monthDay - the month-day to use, not null
		 * 
		 * Returns:
		 * 
		 * the local date formed from this year and the specified
		 * month-day, not null
		 */
		LocalDate localDate = year.atMonthDay(monthDay);
		System.out.println(localDate);
	}

}
