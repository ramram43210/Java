import java.util.Calendar;

public class CalendarDemo
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();
		System.out.println("Before Set = " + cal.getTime());

		cal.set(Calendar.HOUR, 10);
		cal.set(Calendar.MINUTE, 29);
		cal.set(Calendar.SECOND, 22);

		System.out.println("After Set  = " + cal.getTime());

		System.out.println("Hour = " + cal.get(Calendar.HOUR));
		System.out.println("Min = " + cal.get(Calendar.MINUTE));
		System.out.println("Sec = " + cal.get(Calendar.SECOND));

	}
}
