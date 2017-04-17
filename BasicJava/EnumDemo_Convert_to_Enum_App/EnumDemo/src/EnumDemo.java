public class EnumDemo
{
	public static void main(String[] args)
	{
		/*
		 * Convert a String to Enum object.
		 */
		Operation operation = Operation.valueOf("plus".toUpperCase());
		System.out.println(operation);
		
		System.out.println(operation.calculate(10, 20));
	}
}