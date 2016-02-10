/*
 * Converting Strings to Numbers.
 */
public class ValueOfDemo
{

	public static void main(String[] args)
	{
		/*
		 * The Number subclasses that wrap primitive numeric
		 * types ( Byte, Integer, Double, Float, Long, and
		 * Short) each provide a class method named valueOf
		 * that converts a string to an object of that type
		 */
		Integer integerObj = Integer.valueOf("100");
		System.out.println("integerObj    = " + integerObj);

		Double doubleObj = Double.valueOf("20.289");
		System.out.println("doubleObj = " + doubleObj);
	}
}
