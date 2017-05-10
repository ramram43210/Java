@FunctionalInterface
interface StringLengthLambda
{
	int getLength(String str);
}

public class LambdaDemo
{

	public static void main(String[] args)
	{
		printLambda(str -> str.length());
	}

	private static void printLambda(StringLengthLambda stringLengthLambda)
	{
		int length = stringLengthLambda.getLength("Welcome");
		System.out.println("length = " + length);
	}

}
