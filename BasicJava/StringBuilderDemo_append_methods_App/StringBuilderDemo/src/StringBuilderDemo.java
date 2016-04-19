public class StringBuilderDemo
{

	public static void main(String[] args)
	{
		StringBuilder sb = new StringBuilder("Hello ");
		int intValue = 20;
		sb.append(intValue);
		double doubleValue = 500.4;
		sb.append(doubleValue);
		System.out.println(sb);
	}
}
