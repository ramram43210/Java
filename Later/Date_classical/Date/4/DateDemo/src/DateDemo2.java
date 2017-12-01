import java.util.Date;

public class DateDemo2
{
	public static void main(String[] args)
	{
		Date date = new Date();
		System.out.println("Date before setting =  " + date);

		/*
		 * Parameters:
		 * 
		 * time - the number of milliseconds.
		 */
		date.setTime(200000);

		System.out.println("Date after setting  =  " + date);

	}

}
