import java.sql.Date;
import java.time.LocalDate;

public class SqlDateDemo
{
	public static void main(String[] args)
	{
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);

		/*
		 * Parameters:
		 *
		 * date - a LocalDate to convert
		 *
		 * Returns:
		 *
		 * a Date object
		 */
		Date date = Date.valueOf(localDate);
		System.out.println(date);
	}

}
