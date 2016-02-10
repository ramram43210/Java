/*
 * Converting Numbers to Strings.
 */
public class NumberToStringDemo
{

	public static void main(String[] args)
	{
		/*
		 * Sometimes you need to convert a number to a
		 * string because you need to operate on the value
		 * in its string form.
		 */
		int i = 10;
		String s1 = "" + i;
		System.out.println("s1    = " + s1);

		int j = 199;
		String s2 = String.valueOf(j);
		System.out.println("s2    = " + s2);

		double d = 199.34;
		String s3 = String.valueOf(d);
		System.out.println("s3    = " + s3);

	}
}
