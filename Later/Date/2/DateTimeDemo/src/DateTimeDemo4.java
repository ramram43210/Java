import java.util.Date;

public class DateTimeDemo4
{

	public static void main(String[] args)
	{
		/*
		 * It is recommended to use Calendar class for getting current
		 * date and time in classical Date API. Since Java 8, you can
		 * use LocalDate, LocalTime or LocalDateTime classes.
		 */
		Date date = java.util.Calendar.getInstance().getTime();
		System.out.println(date);
	}

}
