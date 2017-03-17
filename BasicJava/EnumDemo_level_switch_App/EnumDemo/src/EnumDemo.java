public class EnumDemo
{

	public static void main(String[] args)
	{
		Level level = Level.MEDIUM;

		/*
		 * We can use enums in switch statements like this.
		 */
		switch (level)
		{
		case HIGH:
			System.out.println("This is high voltage");
			break;
		case MEDIUM:
			System.out.println("This is meidum voltage");
			break;
		case LOW:
			System.out.println("This is low voltage");
			break;
		}

	}
}