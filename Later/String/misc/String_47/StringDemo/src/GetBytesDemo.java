
public class GetBytesDemo
{
	public static void main(String[] args)
	{
		String str = "Hi";

		/*
		 * public byte[] getBytes(Charset charset)
		 * 
		 * Encodes this String into a sequence of bytes
		 * using the given charset, storing the result into
		 * a new byte array.
		 * 
		 * Parameters: 
		 * ----------
		 * 
		 * charset - The Charset to be used to encode the
		 * String
		 * 
		 * Returns: 
		 * -------
		 * 
		 * The resultant byte array
		 */

		java.nio.charset.Charset charSet = java.nio.charset.Charset
				.forName("ASCII");
		byte[] byteArray = str.getBytes(charSet);
		System.out
				.println("byteArray of \"Hi\" with charsetName \"ASCII\" = "
						+ byteArray);
		for (byte b : byteArray)
		{
			System.out.println(b);
		}

	}
}