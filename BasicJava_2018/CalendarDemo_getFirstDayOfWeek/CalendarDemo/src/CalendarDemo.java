import java.util.Calendar;

public class CalendarDemo
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();

		/*
		 * Returns:the first day of the week.
		 */
		int firstDayOfTheWeek = cal.getFirstDayOfWeek();

		System.out.println("firstDayOfTheWeek = " + firstDayOfTheWeek);
		
		switch (firstDayOfTheWeek) {
        case (1):
           System.out.println("Sunday");
           break;
        case (2):
           System.out.println("Monday");
           break;
        case 3:
           System.out.println("Tuesday");
           break;
        case 4:
           System.out.println("Wednesday");
           break;
        case 5:
           System.out.println("Thrusday");
           break;
        case 6:
           System.out.println("Friday");
           break;
        case 7:
           System.out.println("Saturday");
           break;
     }
	}
}
