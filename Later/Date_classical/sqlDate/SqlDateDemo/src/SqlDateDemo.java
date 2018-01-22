import java.sql.Date;

public class SqlDateDemo
{
	public static void main(String[] args) throws InterruptedException
	{
		long millis = System.currentTimeMillis();
		java.sql.Date date = new Date(millis);
		System.out.println(date);
	}

}
