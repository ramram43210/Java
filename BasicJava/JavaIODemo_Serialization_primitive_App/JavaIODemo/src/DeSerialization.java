import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization
{

	public static void main(String[] args) throws FileNotFoundException,
			IOException, ClassNotFoundException
	{
		DeSerialization deSerialization = new DeSerialization();
		deSerialization.readPrimitiveValues();
	}

	private void readPrimitiveValues() throws IOException,
			FileNotFoundException, ClassNotFoundException
	{
		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;

		try
		{
			fileInputStream = new FileInputStream("myfile.txt");
			objectInputStream = new ObjectInputStream(fileInputStream);

			System.out
					.println("Successfully read primitive values from the file.\n");

			int intValue = objectInputStream.readInt();
			double doubleValue = objectInputStream.readDouble();
			boolean booleanValue = objectInputStream.readBoolean();

			System.out.println("intValue = " + intValue);
			System.out.println("doubleValue = " + doubleValue);
			System.out.println("booleanValue = " + booleanValue);

		}
		finally
		{

			if (objectInputStream != null)
			{
				/*
				 * Closing a ObjectInputStream will also
				 * close the InputStream instance from which
				 * the ObjectInputStream is reading.
				 */
				objectInputStream.close();
			}
		}

	}

}
