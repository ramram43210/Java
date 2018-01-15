import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo1
{
	public static void main(String[] args)
	{
		SimpleDateFormat formatter = new SimpleDateFormat();

		/*
		 * Parameters:
		 * 
		 * pattern - a String to be mapped to the new date and time
		 * format pattern for this format
		 */
		formatter.applyLocalizedPattern("dd-MMM-yyyy");
		String strDate = formatter.format(new Date());
		System.out.println(strDate);
	}

}
