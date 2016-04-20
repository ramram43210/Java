public class StringBuilderDemo
{

	public static void main(String[] args)
	{
		StringBuilder sb = new StringBuilder("Hello  World");
		System.out.println(sb);
		int intValue = 100;
		sb.insert(6, intValue);
		System.out.println(sb);
	}
}