interface StringLengthLambda
{
	int getLength(String str);
}

public class LambdaDemo
{

	public static void main(String[] args)
	{
		//explain with remove string and ()
		StringLengthLambda stringLengthLambda = (String str) -> str.length();
		int length = stringLengthLambda.getLength("Welcome");
		System.out.println("length = " + length);
	}

}
