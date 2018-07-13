import java.util.Calendar;

public class CalendarDemo2
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());

		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		if (Calendar.SUNDAY == dayOfWeek)
		{
			System.out.println("SUNDAY");
		}
		if (Calendar.MONDAY == dayOfWeek)
		{
			System.out.println("MONDAY");
		}
		if (Calendar.TUESDAY == dayOfWeek)
		{
			System.out.println("TUESDAY");
		}
		if (Calendar.WEDNESDAY == dayOfWeek)
		{
			System.out.println("WEDNESDAY");
		}
		if (Calendar.THURSDAY == dayOfWeek)
		{
			System.out.println("THURSDAY");
		}
		if (Calendar.FRIDAY == dayOfWeek)
		{
			System.out.println("FRIDAY");
		}
		if (Calendar.SATURDAY == dayOfWeek)
		{
			System.out.println("SATURDAY");
		}
	}

}
