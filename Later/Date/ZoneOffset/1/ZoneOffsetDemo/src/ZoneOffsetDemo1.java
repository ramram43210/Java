import java.time.ZoneOffset;

public class ZoneOffsetDemo1
{

	public static void main(String[] args)
	{

		  ZoneOffset zoneOffsetMin = ZoneOffset.MIN;
		  System.out.println("Min = "+zoneOffsetMin);
		  
		  ZoneOffset zoneOffsetMax = ZoneOffset.MAX;
		  System.out.println("Max = "+zoneOffsetMax);
		  
		  ZoneOffset zoneOffsetUtc = ZoneOffset.UTC;
		  System.out.println("UTC = "+zoneOffsetUtc);
	}

}
