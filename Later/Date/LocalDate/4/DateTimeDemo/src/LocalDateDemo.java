import java.time.LocalDate;

public class LocalDateDemo
{

	public static void main(String[] args)
	{
		LocalDate date1 = LocalDate.of(2017, 9, 25);

		/*
		 * Returns:true if the year is leap, false otherwise
		 */
		System.out.println(date1.isLeapYear());

		LocalDate date2 = LocalDate.of(2020, 9, 25);
		System.out.println(date2.isLeapYear());
	}

}
