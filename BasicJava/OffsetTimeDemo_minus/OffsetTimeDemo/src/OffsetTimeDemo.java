import java.time.OffsetTime;

public class OffsetTimeDemo
{

	public static void main(String[] args)
	{

		OffsetTime offsetTime1 = OffsetTime.now();
		System.out.println("offsetTime1     = " + offsetTime1);

		OffsetTime offsetTime2 = offsetTime1.minusHours(1);
		System.out.println("Hour changed    = " + offsetTime2);

		OffsetTime offsetTime3 = offsetTime2.minusMinutes(10);
		System.out.println("Min changed     = " + offsetTime3);

		OffsetTime offsetTime4 = offsetTime3.minusSeconds(20);
		System.out.println("Sec changed     = " + offsetTime4);

		OffsetTime offsetTime5 = offsetTime4.minusNanos(50);
		System.out.println("NanoSec changed = " + offsetTime5);

	}

}
