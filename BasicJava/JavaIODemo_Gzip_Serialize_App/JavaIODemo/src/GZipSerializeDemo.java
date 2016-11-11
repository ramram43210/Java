import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.zip.GZIPOutputStream;

/*
 * We can compress the serialized object to
 * reduce the file size.
 */
public class GZipSerializeDemo
{

	public static void main(String[] args) throws IOException
	{
		GZipSerializeDemo gzipSerializeDemo = new GZipSerializeDemo();
		String gzipPath = "D:/work/person.gz";
		gzipSerializeDemo.gzipPersonObject(gzipPath);
	}

	public void gzipPersonObject(String gzipPath) throws IOException
	{

		Person person = new Person("Peter", 45);
		/*
		 * If the Streams are within the
		 * "try-With-Resources" block, then it will be
		 * closed automatically.
		 */
		try (FileOutputStream fos = new FileOutputStream(gzipPath);
				GZIPOutputStream gz = new GZIPOutputStream(fos);
				ObjectOutputStream oos = new ObjectOutputStream(gz);)

		{

			oos.writeObject(person);
			System.out.println("Person object is serialized and compressed.");

		}

	}
}