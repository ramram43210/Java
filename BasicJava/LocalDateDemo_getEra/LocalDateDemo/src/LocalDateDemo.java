import java.time.LocalDate;
import java.time.chrono.Era;

public class LocalDateDemo
{

	public static void main(String[] args)
	{
		LocalDate date = LocalDate.parse("2017-11-23");

		/*
		 * Returns:the IsoChronology era constant applicable at this
		 * date, not null
		 */
		Era era = date.getEra();
		System.out.println(era);
	}

}
