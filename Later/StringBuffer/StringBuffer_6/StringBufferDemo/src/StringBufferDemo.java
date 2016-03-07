public class StringBufferDemo
{

	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("Hello  World");
		int i = 100;
		sb.insert(6, i);
		System.out.println(sb);
	}
}
