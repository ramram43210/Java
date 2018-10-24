import java.sql.Date;
import java.time.LocalDate;

public class SqlDateDemo
{
	public static void main(String[] args)
	{
		long millis = System.currentTimeMillis();
		java.sql.Date date = new Date(millis);
		System.out.println(date);

		/*
		 * Returns:
		 *
		 * a LocalDate object representing the same date value
		 */
		LocalDate localDate = date.toLocalDate();
		System.out.println(localDate);
	}

}
