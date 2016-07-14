import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayInputStreamDemo
{

	public static void main(String[] args) throws IOException
	{
		FileOutputStream fileOutputStream1 = new FileOutputStream(
				"myfile1.txt");

		FileOutputStream fileOutputStream2 = new FileOutputStream(
				"myfile2.txt");

		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

		String str = "Welcome to India";

		byteArrayOutputStream.write(str.getBytes());
		byteArrayOutputStream.writeTo(fileOutputStream1);
		byteArrayOutputStream.writeTo(fileOutputStream2);

		byteArrayOutputStream.flush();
		byteArrayOutputStream.close();// has no effect
		System.out.println("successfully written to two files...");
	}
}
