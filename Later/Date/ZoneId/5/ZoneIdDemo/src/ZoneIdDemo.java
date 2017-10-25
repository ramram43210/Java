import java.time.ZoneId;

public class ZoneIdDemo
{

	public static void main(String[] args)
	{
		ZoneId zoneId = ZoneId.systemDefault();

		/*
		 * Normalizes the time-zone ID, returning a ZoneOffset where
		 * possible.
		 */
		zoneId = zoneId.normalized();
		System.out.println(zoneId);
	}

}
