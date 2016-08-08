import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOuputputStreamDemo
{

	public static void main(String[] args) throws Exception
	{
		DataOuputputStreamDemo dataOuputputStreamDemo = new DataOuputputStreamDemo();
		dataOuputputStreamDemo.writePrimitiveData();
		dataOuputputStreamDemo.readPrimitiveData();
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

	public void writePrimitiveData() throws IOException
	{
		DataOutputStream dataOutputStream = null;
		FileOutputStream fileOutputStream = null;
		try
		{
			fileOutputStream = new FileOutputStream("data.txt");
			dataOutputStream = new DataOutputStream(fileOutputStream);
			int[] intArray = { 100, 250, 440, 550, 900 };
		
			for (int j : intArray)
			{
				dataOutputStream.writeInt(j);
			}

			System.out.println("Successfully written to \'data.txt\' file\n");
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