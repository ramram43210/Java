import java.util.Calendar;

public class CalendarDemo1
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		
		int month = cal.get(Calendar.MONTH);
		if (month == Calendar.JANUARY)
		{
			System.out.println("JANUARY");
		}
		if (month == Calendar.FEBRUARY)
		{
			System.out.println("FEBRUARY");
		}
		if (month == Calendar.MARCH)
		{
			System.out.println("MARCH");
		}
		if (month == Calendar.APRIL)
		{
			System.out.println("APRIL");
		}
		if (month == Calendar.MAY)
		{
			System.out.println("MAY");
		}
		if (month == Calendar.JUNE)
		{
			System.out.println("JUNE");
		}
		if (month == Calendar.JULY)
		{
			System.out.println("JULY");
		}
		if (month == Calendar.AUGUST)
		{
			System.out.println("AUGUST");
		}
		if (month == Calendar.SEPTEMBER)
		{
			System.out.println("SEPTEMBER");
		}
		if (month == Calendar.OCTOBER)
		{
			System.out.println("OCTOBER");
		}
		if (month == Calendar.NOVEMBER)
		{
			System.out.println("NOVEMBER");
		}
		if (month == Calendar.DECEMBER)
		{
			System.out.println("DECEMBER");
		}
	}
}
