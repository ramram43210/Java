import java.io.UnsupportedEncodingException;

/*
 * public byte[] getBytes(String charsetName) throws
 * UnsupportedEncodingException
 * 
 * Parameters: 
 * ---------- 
 * charsetName - The name of a supported charset.
 * 
 * Returns: 
 * ------- 
 * The resultant byte array
 * 
 * Throws: 
 * ------ 
 * UnsupportedEncodingException - If the named
 * charset is not supported
 */
public class GetBytesDemo
{
	public static void main(String[] args)
	{
		String str = "Hi";

		try
		{
			byte[] byteArray = str.getBytes("UTF-8");
			System.out
					.println("byteArray of \"Hi\" with charsetName \"UTF-8\" = "
							+ byteArray);
			for (byte b : byteArray)
			{
				System.out.println(b);
			}
			System.out.println("--------------------");
			byteArray = str.getBytes("ISO-8859-1");
			System.out
					.println("byteArray of \"Hi\" with charsetName \"ISO-8859-1\" = "
							+ byteArray);
			for (byte b : byteArray)
			{
				System.out.println(b);
			}
		}
		catch (UnsupportedEncodingException e)
		{
			e.printStackTrace();
		}

	}
}