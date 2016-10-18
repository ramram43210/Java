import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.zip.GZIPOutputStream;

/*
 * We can compress the serialized object to 
 * reduce the file size.
 */
public class GZipDemo
{

	public static void main(String[] args) throws IOException
	{
		GZipDemo gzipDemo = new GZipDemo();
		String gzipPath = "D:/work/person.gz";
		gzipDemo.gzipPersonObject(gzipPath);
	}

	public void gzipPersonObject(String gzipPath) throws IOException
	{

		Person person = new Person("Peter", 45);

		try (
				FileOutputStream fos = new FileOutputStream(gzipPath);
				GZIPOutputStream gz = new GZIPOutputStream(fos);
				ObjectOutputStream oos = new ObjectOutputStream(gz);)

		{

			oos.writeObject(person);
			System.out.println("Done");

		}

	}
}