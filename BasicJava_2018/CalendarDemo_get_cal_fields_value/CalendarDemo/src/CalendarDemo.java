import java.util.Calendar;

public class CalendarDemo
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		
		System.out.println("What day of the month = "+cal.get(Calendar.DATE));
		
		System.out.println("What day of the month = "+cal.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("What day of the week = "+cal.get(Calendar.DAY_OF_WEEK));
		
		System.out.println("What week in month = "+cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
		System.out.println("What week in month = "+cal.get(Calendar.WEEK_OF_MONTH));
		
		System.out.println("What day of the year = "+cal.get(Calendar.DAY_OF_YEAR));
		
		System.out.println("What week of the year = "+cal.get(Calendar.WEEK_OF_YEAR));
		
		System.out.println("What hour of the day =  "+cal.get(Calendar.HOUR_OF_DAY));
		
	}
}
