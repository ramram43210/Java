import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.zip.GZIPInputStream;

/*
 * How to decompress serialized object from a Gzip file.
 */
public class GZipDeserializeDemo
{

	public static void main(String[] args) throws IOException,
			ClassNotFoundException
	{
		GZipDeserializeDemo gzipDeserializeDemo = new GZipDeserializeDemo();
		String gzipPath = "D:/work/person.gz";
		Person person = gzipDeserializeDemo.deserializePersonObject(gzipPath);
		System.out.println("Name : " + person.getName());
		System.out.println("Age : " + person.getAge());
	}

	public Person deserializePersonObject(String gzipPath)
			throws ClassNotFoundException, IOException
	{
		/*
		 * If the Streams are within the
		 * "try-With-Resources" block, then it will be
		 * closed automatically.
		 */
		try (FileInputStream fin = new FileInputStream(gzipPath);
				GZIPInputStream gis = new GZIPInputStream(fin);
				ObjectInputStream ois = new ObjectInputStream(gis);)
		{

			Person person = (Person) ois.readObject();

			return person;

		}

	}
}