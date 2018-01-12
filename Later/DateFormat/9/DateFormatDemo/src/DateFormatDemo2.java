import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;

public class DateFormatDemo2
{
	public static void main(String[] args)
	{
		DateFormat dateFormat = DateFormat.getTimeInstance(DateFormat.LONG);
		String s = dateFormat.format(new Date());

		/*
		 * Returns:
		 * 
		 * the number formatter which this date/time formatter uses.
		 */
		NumberFormat numberFormat = dateFormat.getNumberFormat();
		System.out.println(numberFormat);

	}
}
