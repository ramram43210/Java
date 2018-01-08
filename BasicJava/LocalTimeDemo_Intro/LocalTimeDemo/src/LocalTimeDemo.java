import java.time.LocalTime;

public class LocalTimeDemo
{

	public static void main(String[] args)
	{
		/*
		 * Returns:the current time using the system clock and default
		 * time-zone, not null
		 */
		LocalTime time = LocalTime.now();
		System.out.println(time);
		System.out.println("Hour = "+time.getHour());
		System.out.println("Min = "+time.getMinute());
		System.out.println("Seonds = "+time.getSecond());
		System.out.println("Nano = "+time.getNano());
	}

}
