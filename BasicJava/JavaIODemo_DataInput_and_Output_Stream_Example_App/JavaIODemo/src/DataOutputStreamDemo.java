import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamDemo
{

	public static void main(String[] args) throws Exception
	{
		DataOutputStreamDemo dataOutputStreamDemo = new DataOutputStreamDemo();
		dataOutputStreamDemo.writePrimitiveData();
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