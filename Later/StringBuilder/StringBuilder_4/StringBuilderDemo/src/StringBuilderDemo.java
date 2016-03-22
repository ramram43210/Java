public class StringBuilderDemo
{

	public static void main(String[] args)
	{
		StringBuilder sb = new StringBuilder("Hello ");
		int i = 20;
		sb.append(i);
		double d = 500.4;
		sb.append(d);
		System.out.println(sb);
	}
}
