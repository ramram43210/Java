import java.sql.Date;

public class SqlDateDemo
{
	public static void main(String[] args)
	{
		long millis = System.currentTimeMillis();
		Date date = new Date(millis);
		System.out.println(date);
	}

}
