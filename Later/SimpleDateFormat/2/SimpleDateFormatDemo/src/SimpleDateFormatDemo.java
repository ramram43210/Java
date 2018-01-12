import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo
{
	public static void main(String[] args)
	{

		Date date = new Date();  
	    SimpleDateFormat formatter = new SimpleDateFormat("MM/DD/YYYY");  
	    String strDate = formatter.format(date);  
	    System.out.println("Date Format with MM/DD/YYYY = "+strDate);  
	  
	    formatter = new SimpleDateFormat("DD-MM-YYYY hh:mm:ss");  
	    strDate = formatter.format(date);  
	    System.out.println("Date Format with DD-MM-YYYY hh:mm:ss = "+strDate);  
	  
	    formatter = new SimpleDateFormat("DD MMMM YYYY");  
	    strDate = formatter.format(date);  
	    System.out.println("Date Format with DD MMMM YYYY = "+strDate);  
	  
	    formatter = new SimpleDateFormat("DD MMMM YYYY zzzz");  
	    strDate = formatter.format(date);  
	    System.out.println("Date Format with DD MMMM YYYY zzzz = "+strDate);  
	  
	    formatter = new SimpleDateFormat("E, DD MMM YYYY HH:mm:ss z");  
	    strDate = formatter.format(date);  
	    System.out.println("Date Format with E, DD MMM YYYY HH:mm:ss z : "+strDate); 
	}

}
