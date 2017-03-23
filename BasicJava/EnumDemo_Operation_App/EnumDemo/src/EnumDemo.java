public class EnumDemo
{
	public static void main(String[] args)
	{
		long result = Operation.MULTIPLY.calculate(4, 2);
        System.out.println("Multiply Result = "+result);
        
        result = Operation.PLUS.calculate(4, 2);
        System.out.println("Plus Result = "+result);
	}
}