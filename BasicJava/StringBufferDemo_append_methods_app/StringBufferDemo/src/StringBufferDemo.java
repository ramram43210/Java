public class StringBufferDemo
{

	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer("Hello ");
		int i = 20;
		sb.append(i);
		double d = 500.4;
		sb.append(d);
		System.out.println(sb);
	}
}
