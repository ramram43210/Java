import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputStreamDemo
{

	public static void main(String[] args) throws Exception
	{
		DataInputStreamDemo dataInputStreamDemo = new DataInputStreamDemo();
		dataInputStreamDemo.writePrimitiveData();
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

	public void writePrimitiveData() throws IOException
	{
		DataOutputStream dataOutputStream = null;
		FileOutputStream fileOutputStream = null;
		try
		{
			fileOutputStream = new FileOutputStream("data.bin");
			dataOutputStream = new DataOutputStream(fileOutputStream);

			dataOutputStream.writeInt(125);
			dataOutputStream.writeFloat(150.45F);
			dataOutputStream.writeLong(9090);
			dataOutputStream.writeBoolean(true);
			
			System.out.println("Successfully written to \'data.bin\' file\n");
		}
		finally
		{
			if (dataOutputStream != null)
			{
				/*
				 * Closing a DataOutputStream will also
				 * close the OutputStream instance to which
				 * the DataOutputStream is writing.
				 */
				dataOutputStream.close();
			}
		}

	}
}