public class StringBufferDemo
{

	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("Hello  World");
		System.out.println(sb);
		int intValue = 100;
		sb.insert(6, intValue);
		System.out.println(sb);
	}
}
