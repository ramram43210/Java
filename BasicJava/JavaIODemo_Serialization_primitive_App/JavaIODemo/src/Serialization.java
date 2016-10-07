import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization
{

	public static void main(String[] args) throws FileNotFoundException,
			IOException, ClassNotFoundException
	{
		Serialization serialization = new Serialization();
		serialization.writePrimitiveValues();
	}

	private void writePrimitiveValues() throws FileNotFoundException,
			IOException
	{
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;
		try
		{
			fileOutputStream = new FileOutputStream("myfile.txt");
			objectOutputStream = new ObjectOutputStream(fileOutputStream);

			objectOutputStream.writeInt(10);
			objectOutputStream.writeDouble(50.55);
			objectOutputStream.writeBoolean(true);
			
			System.out
					.println("Successfully written primitive values to the file.\n");
		}
		finally
		{

			if (objectOutputStream != null)
			{
				/*
				 * Closing a ObjectOutputStream will also
				 * close the OutputStream instance to which
				 * the ObjectOutputStream is writing.
				 */
				objectOutputStream.close();
			}
		}

	}

}
