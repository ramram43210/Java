import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteArrayOutputStreamDemo
{

	/*
	 * The following code creates a ByteArrayOutputStream
	 * and store value in it. Then it get the byte array out
	 * of ByteArrayOutputStream and print them out.
	 */
	public static void main(String[] args) throws IOException
	{
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		bout.write(("Hello world").getBytes());

		System.out.println(Arrays.toString(bout.toByteArray()));

		System.out.println(bout.toString());

		System.out.println(new String(bout.toByteArray()));
	}

}
