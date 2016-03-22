public class StringBuilderDemo
{

	public static void main(String[] args)
	{
		StringBuilder sb = new StringBuilder("Hello  World");
		int i = 100;
		sb.insert(6, i);
		System.out.println(sb);
	}
}