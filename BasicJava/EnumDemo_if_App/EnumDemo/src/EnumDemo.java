public class EnumDemo
{

	public static void main(String[] args)
	{
		Level level = Level.MEDIUM;
		
		if (level == Level.HIGH)
		{
			System.out.println("This is high voltage");
		}
		else if (level == Level.MEDIUM)
		{
			System.out.println("This is meidum voltage");
		}
		else if (level == Level.LOW)
		{	
			System.out.println("This is low voltage");
		}
	}
}