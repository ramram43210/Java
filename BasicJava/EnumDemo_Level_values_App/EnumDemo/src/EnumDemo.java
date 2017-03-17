public class EnumDemo
{

	public static void main(String[] args)
	{
		/*
		 * We can obtain an array of all the possible values
		 * of a Java enum type by calling its static
		 * values() method.
		 * 
		 * All enum types get a static values() method
		 * automatically by the Java compiler.
		 * 
		 * Notice the output how the names of the constants
		 * themselves are printed out. This is one area
		 * where Java enums are different than static final
		 * constants.
		 */
		
		Level[] levelArray = Level.values();
		
		for (Level level : levelArray)
		{
			System.out.println(level);
		}
	}
}