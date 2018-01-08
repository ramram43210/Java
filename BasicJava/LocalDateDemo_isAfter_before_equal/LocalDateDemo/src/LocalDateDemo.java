import java.time.LocalDate;

public class LocalDateDemo
{

	public static void main(String[] args)
	{
		LocalDate date1 = LocalDate.parse("2018-07-03");
		System.out.println("date1= "+date1);
		
		LocalDate date2 = LocalDate.parse("2017-03-03");
		System.out.println("date2= "+date2);
		
		/*
		 * Returns:true if this date is after the specified date
		 */
		System.out.println(date1.isAfter(date2));

		/*
		 * Returns:true if this date is before the specified date
		 */
		System.out.println(date1.isBefore(date2));

		/*
		 * Returns:true if this date is equal to the specified date
		 */
		System.out.println(date1.isEqual(date2));

	}

}
