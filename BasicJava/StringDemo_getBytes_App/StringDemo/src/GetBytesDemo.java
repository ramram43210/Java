/*
 * public byte[] getBytes()
 * 
 * Encodes this String into a sequence of bytes
 * using the platform's default charset, storing the
 * result into a new byte array.
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

		byte[] byteArray = str.getBytes();
		System.out.println("byteArray of \"Hi\" = " + byteArray);

		for (byte b : byteArray)
		{
			System.out.println(b);
		}
	}
}