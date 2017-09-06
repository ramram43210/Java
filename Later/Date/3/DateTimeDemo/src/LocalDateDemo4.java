import java.time.LocalDate;

public class LocalDateDemo4
{

	public static void main(String[] args)
	{
		/*
		 * Obtains an instance of LocalDate from a text string such as
		 * 2007-12-03
		 */
		LocalDate date = LocalDate.parse("2007-12-03");
		System.out.println("date = " + date);

	}

}
