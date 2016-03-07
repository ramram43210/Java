/*
 * Converting Numbers to Strings.
 */
public class NumberToStringDemo
{

	public static void main(String[] args)
	{
		/*
		 * Each of the Number subclasses includes a class
		 * method, toString(), that will convert its
		 * primitive type to a string.
		 */
		double d = 543.48;
		String s = Double.toString(d);
		System.out.println("s = "+s);

		int dot = s.indexOf('.');

		System.out
				.println(dot + " digits " + "before decimal point.");
		System.out.println((s.length() - dot - 1)
				+ " digits after decimal point.");
		
		int i = 190;
		String s3 = Integer.toString(i); 
		System.out.println("s3 = "+s3);

	}
}
