import java.sql.Date;

public class SqlDateDemo
{
	public static void main(String[] args)
	{
		String strDate = "2018-05-25";

		/*
		 * Parameters:s -
		 *
		 * a String object representing a date in in the format
		 * "yyyy-[m]m-[d]d". The leading zero for mm and dd may also
		 * be omitted.
		 *
		 * Returns:
		 *
		 * a java.sql.Date object representing the given date
		 */
		Date date = Date.valueOf(strDate);
		System.out.println(date);
	}

}
