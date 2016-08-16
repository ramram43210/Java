import java.io.IOException;

public class FormatDemo2
{

	public static void main(String[] args) throws IOException
	{
		int i = 20;
		double r = Math.sqrt(i);
		System.out.println("r = "+r);

		/*
		 * All format specifiers begin with a % and end with
		 * a 1- or 2-character conversion that specifies the
		 * kind of formatted output being generated. The
		 * three conversions used here are:
		 * 
		 * d - formats an integer value as a decimal value.
		 * 
		 * f - formats a floating point value as a decimal
		 * value.
		 * 
		 * n - outputs a platform-specific line terminator.
		 */

		System.out.format("The square root of %d is %f.%n", i, r);
	}
}
