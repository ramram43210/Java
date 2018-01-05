import java.time.LocalDate;

public class LocalDateDemo1
{

	public static void main(String[] args)
	{
		/*
		 * Returns:the current date using the system clock and default
		 * time-zone, not null
		 */
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		System.out.println("Year = " + localDate.getYear());
		System.out.println("Month = " + localDate.getMonthValue());
		System.out.println("DayOfMonth = " + localDate.getDayOfMonth());
		System.out.println("DayOfWeek = " + localDate.getDayOfWeek());

	}

}
