import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo2
{
	public static void main(String[] args)
	{
		SimpleDateFormat formatter = new SimpleDateFormat();

		/*
		 * Parameters:
		 *
		 * pattern - the new date and time pattern for this date
		 * format
		 */
		formatter.applyPattern("MMM");
		String strDate = formatter.format(new Date());
		System.out.println(strDate);
	}

}
