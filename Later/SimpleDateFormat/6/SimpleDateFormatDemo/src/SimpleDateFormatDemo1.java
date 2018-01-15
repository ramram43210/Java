import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo1
{
	public static void main(String[] args)
	{
		SimpleDateFormat formatter = new SimpleDateFormat();
	    
	    String date = formatter.format(new Date());
	    
	    /*
	     * Returns:a localized pattern string describing this date format.
	     */
	    String strPattern = formatter.toLocalizedPattern();
	    
	    System.out.println(strPattern);
	    System.out.println("date = " + date);
	}

}
