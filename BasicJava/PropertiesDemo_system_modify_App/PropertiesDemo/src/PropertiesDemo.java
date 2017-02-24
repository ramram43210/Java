import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo
{

	public static void main(String[] args) throws IOException
	{
		/*
		 * Set up new properties object from file
		 * "myProperties.txt"
		 */
		FileInputStream fis = new FileInputStream("myProperties.txt");
		/*
		 * This statement initializes the new properties
		 * object, p, with the current set of system
		 * properties
		 */
		Properties p = new Properties(System.getProperties());
		p.load(fis);

		/*
		 * To modify the existing set of system properties,
		 * use System.setProperties. This method takes a
		 * Properties object that has been initialized to
		 * contain the properties to be set. This method
		 * replaces the entire set of system properties with
		 * the new set represented by the Properties object.		 * 
		 */
		System.setProperties(p);
		// display new properties
		System.getProperties().list(System.out);

	}
}