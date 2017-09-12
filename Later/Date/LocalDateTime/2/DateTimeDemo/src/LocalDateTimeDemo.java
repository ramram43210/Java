import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class LocalDateTimeDemo
{

	public static void main(String[] args)
	{
		LocalDateTime localDateTime = LocalDateTime.now();  
		System.out.println("DAY_OF_WEEK = "+localDateTime.get(ChronoField.DAY_OF_WEEK));  
	    System.out.println("DAY_OF_YEAR = "+localDateTime.get(ChronoField.DAY_OF_YEAR));  
	    System.out.println("DAY_OF_MONTH = "+localDateTime.get(ChronoField.DAY_OF_MONTH));  
	    System.out.println("HOUR_OF_DAY = "+localDateTime.get(ChronoField.HOUR_OF_DAY));  
	    System.out.println("MINUTE_OF_DAY = "+localDateTime.get(ChronoField.MINUTE_OF_DAY));   
	}

}
