/*
 * public void getChars(int srcBegin, int srcEnd, char[]
 *                                        dst, int dstBegin)
 * 
 * Parameters: 
 * ----------
 * srcBegin - start copying at this offset. 
 * 
 * srcEnd - stop copying at this offset.
 *  
 * dst - the array to copy the data into.
 *  
 * dstBegin - offset into dst.
 * 
 * Throws: 
 * -------
 * IndexOutOfBoundsException - if any of the following
 * is true: 
 * 
 * srcBegin is negative. 
 * dstBegin is negative.
 * the srcBegin argument is greater than the srcEnd
 * argument. 
 * srcEnd is greater than this.length().
 * dstBegin+srcEnd-srcBegin is greater than dst.length.
 */
public class StringBuilderDemo
{

	public static void main(String[] args)
	{

		String str = "Welcome to india peter";
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb);

		char[] charArray = new char[30];

		/*
		 * copies characters from starting and ending index
		 * into the destination character array
		 */
		sb.getChars(11, 16, charArray, 0);

		System.out.println(charArray);
	}
}
