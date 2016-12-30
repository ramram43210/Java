import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/*
 * public void storeToXML(OutputStream os, String
 * 								comment) throws IOException
 * 
 * Parameters: 
 * -----------
 * 
 * os - the output stream on which to emit the XML
 * document. 
 * 
 * comment - a description of the property list, 
 * or null if no comment is desired.
 */

class PropertiesDemo
{

	public static void main(String[] args) throws IOException
	{
		Properties p = new Properties();
		// add some properties
		p.put("name", "Dog");
		p.put("age", "2 years");

		try (FileOutputStream fos = new FileOutputStream("properties.xml"))
		{
			/*
			 * Emits an XML document representing all of the
			 * properties contained in this table.
			 */
			p.storeToXML(fos, "Animal properties");
			System.out.println("Xml file is created successfully..");

		}

	}
}