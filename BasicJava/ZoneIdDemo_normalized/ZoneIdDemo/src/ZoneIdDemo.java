import java.time.ZoneId;

public class ZoneIdDemo
{

	public static void main(String[] args)
	{
		ZoneId zoneId = ZoneId.systemDefault();

		/*
		 * Returns a normalized ZoneId
		 */
		zoneId = zoneId.normalized();
		System.out.println(zoneId);
	}

}
