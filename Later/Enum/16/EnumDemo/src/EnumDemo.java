public class EnumDemo
{
	public static void main(String[] args)
	{
		/*
		 * To loop a Enum object.
		 */
		for (Operation operation : Operation.values())
		{
			System.out.println(operation);
		}
	}
}