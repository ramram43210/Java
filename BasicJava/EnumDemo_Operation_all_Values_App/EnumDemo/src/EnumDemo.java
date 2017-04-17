enum Operation
{
	PLUS, MINUS, MULTIPLY, DIVIDE;

}

public class EnumDemo
{
	public static void main(String[] args)
	{
		
		Operation[] operationArray = Operation.values();
		
		/*
		 * To loop a Enum object.
		 */
		for (Operation operation : operationArray)
		{
			System.out.println(operation);
		}
	}
}