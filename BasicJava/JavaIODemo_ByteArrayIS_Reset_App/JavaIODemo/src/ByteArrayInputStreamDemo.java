import java.io.ByteArrayInputStream;
import java.io.IOException;

/*
 * This example first reads each character from the
 * stream and prints it as is, in lowercase. It then
 * resets the stream and begins reading again, this time
 * converting each character to uppercase before
 * printing.
 */

public class ByteArrayInputStreamDemo
{

	public static void main(String[] args) throws IOException
	{
		String str = "ram";
		byte byteArray[] = str.getBytes();
		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
		for (int i = 0; i < 2; i++)
		{
			int c;
			while ((c = byteArrayInputStream.read()) != -1)
			{
				if (i == 0)
				{
					System.out.print((char) c);
				}
				else
				{
					System.out.print(Character.toUpperCase((char) c));
				}
			}
			System.out.println();
			/*
			 * A ByteArrayInputStream implements both mark()
			 * and reset(). However, if mark() has not been
			 * called, then reset() sets the stream pointer
			 * to the start of the stream, which in this
			 * case is the start of the byte array passed to
			 * the constructor.
			 * 
			 * Resets the buffer to the marked position. The
			 * marked position is 0 unless another position
			 * was marked or an offset was specified in the
			 * constructor.
			 */
			byteArrayInputStream.reset();
		}
	}

}
