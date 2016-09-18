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
			fileInputStream = new FileInputStream("data.bin");
			dataInputStream = new DataInputStream(fileInputStream);

			int intValue = dataInputStream.readInt();
			float floatValue = dataInputStream.readFloat();
			long longValue = dataInputStream.readLong();
			boolean booleanValue = dataInputStream.readBoolean();

			System.out.println("intValue     = " + intValue);
			System.out.println("floatValue   = " + floatValue);
			System.out.println("longValue    = " + longValue);
			System.out.println("booleanValue = " + booleanValue);
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