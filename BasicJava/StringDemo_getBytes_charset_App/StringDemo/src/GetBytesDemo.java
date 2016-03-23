/*
 * public byte[] getBytes(Charset charset)
 * 
 * Parameters: 
 * ---------- 
 * charset - The Charset to be used to encode the
 * String
 * 
 * Returns: 
 * ------- 
 * The resultant byte array
 */
public class GetBytesDemo
{
	public static void main(String[] args)
	{
		String str = "Hi";

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