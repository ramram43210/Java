import java.time.YearMonth;

public class YearMonthDemo
{

	public static void main(String[] args)
	{

		YearMonth yearMonth = YearMonth.of(2016, 03);
		System.out.println(yearMonth);

		/*
		 * Returns:
		 * 
		 * true if the year is leap, false otherwise
		 */
		boolean isLeapYear = yearMonth.isLeapYear();
		System.out.println("is " + yearMonth.getYear()
				+ " Leap year? = " + isLeapYear);

		System.out.println("------------------------");

		yearMonth = YearMonth.of(2017, 03);
		System.out.println(yearMonth);

		isLeapYear = yearMonth.isLeapYear();
		System.out.println("is " + yearMonth.getYear()
				+ " Leap year? = " + isLeapYear);

	}

}
