import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

class PropertiesDemo
{

	public static void main(String[] args) throws IOException
	{
		Properties p = new Properties();

		try (FileInputStream fis = new FileInputStream("properties.xml"))
		{
			p.loadFromXML(fis);

			Enumeration<?> enumeration = p.propertyNames();

			while (enumeration.hasMoreElements())
			{
				String key = (String) enumeration.nextElement();
				String value = p.getProperty(key);

				System.out.println(key + " = " + value);
			}

		}

	}
}