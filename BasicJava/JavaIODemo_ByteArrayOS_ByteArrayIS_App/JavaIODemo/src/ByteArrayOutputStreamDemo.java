import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamDemo
{

	public static void main(String[] args) throws IOException
	{
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

		System.out.println("Enter the chars:");
		while (byteArrayOutputStream.size() != 4)
		{
			// Gets the inputs from the user
			byteArrayOutputStream.write(System.in.read());
		}

		byte[] byteArray = byteArrayOutputStream.toByteArray();
		
		System.out.println("\nPrint the content");
		for (int x = 0; x < byteArray.length; x++)
		{
			// printing the characters
			System.out.print((char) byteArray[x] + "   ");
		}
		System.out.println("   \n");

		int c;

		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);

		System.out.println("Converting characters to Upper case ");
		for (int y = 0; y < 1; y++)
		{
			while ((c = byteArrayInputStream.read()) != -1)
			{
				System.out.print(Character.toUpperCase((char) c)
						+ "   ");
			}
		}
	}

}
