import java.io.IOException;
import java.util.Date;

public class SystemDemo
{

	public static void main(String[] args) throws IOException
	{
		/*
		 * Returns the current time in milliseconds.
		 */
		long currentTimeInms = System.currentTimeMillis();
		System.out.println("Current Time in milliseconds = " + currentTimeInms);
		
		Date date = new Date(currentTimeInms);		
		System.out.println("Current date and Time = "+date);

	}
}