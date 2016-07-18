import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/*
 * public SequenceInputStream(Enumeration<? extends
 *                                     InputStream> e)
 * 
 * Parameters: 
 * ----------- 
 * 
 * e - an enumeration of input streams.
 */

public class SequenceInputStreamDemo
{

	public static void main(String[] args) throws IOException
	{
		ByteArrayInputStream byteArrayInputStream1 = null;
		ByteArrayInputStream byteArrayInputStream2 = null;
		SequenceInputStream sequenceInputStream = null;

		try
		{
			String s1 = "Hello";
			String s2 = " Peter";
			byte[] b1 = s1.getBytes();
			byte[] b2 = s2.getBytes();
			byteArrayInputStream1 = new ByteArrayInputStream(b1);
			byteArrayInputStream2 = new ByteArrayInputStream(b2);

			Vector<ByteArrayInputStream> vector = new Vector<ByteArrayInputStream>();
			vector.add(byteArrayInputStream1);
			vector.add(byteArrayInputStream2);

			Enumeration<ByteArrayInputStream> enumeration = vector.elements();

			sequenceInputStream = new SequenceInputStream(enumeration);
			int i;
			while ((i = sequenceInputStream.read()) != -1)
			{
				System.out.print((char) i);
			}

		}
		finally
		{
			if (byteArrayInputStream1 != null)
			{
				byteArrayInputStream1.close();
			}
			if (byteArrayInputStream2 != null)
			{
				byteArrayInputStream2.close();
			}
			if (sequenceInputStream != null)
			{
				sequenceInputStream.close();
			}
		}
	}

}
