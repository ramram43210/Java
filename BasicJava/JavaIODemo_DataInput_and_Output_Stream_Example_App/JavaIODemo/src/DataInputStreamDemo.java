import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamDemo
{

	public static void main(String[] args) throws Exception
	{
		DataInputStreamDemo dataInputStreamDemo = new DataInputStreamDemo();
		dataInputStreamDemo.readPrimitiveData();
	}

	public void readPrimitiveData() throws IOException
	{
		FileInputStream fileInputStream = null;
		DataInputStream dataInputStream = null;

		try
		{
			fileInputStream = new FileInputStream("data.txt");
			dataInputStream = new DataInputStream(fileInputStream);

			while (dataInputStream.available() > 0)
			{
				int intValue = dataInputStream.readInt();
				System.out.println(intValue);
			}

		}
		finally
		{
			if (dataInputStream != null)
			{
				/*
				 * Closing a DataInputStream will also close
				 * the InputStream instance from which the
				 * DataInputStream is reading.
				 */
				dataInputStream.close();
			}
		}

	}

}