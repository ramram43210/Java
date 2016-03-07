public class StringBufferDemo
{

	public static void main(String[] args)
	{
		StringBuffer sb1 = new StringBuffer("Hello ");
		int i = 20;
		sb1.append(i);
		double d = 500.4;
		sb1.append(d);
		System.out.println(sb1);
	}
}
