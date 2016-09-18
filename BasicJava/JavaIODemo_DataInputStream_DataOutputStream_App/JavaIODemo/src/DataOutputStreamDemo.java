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
			fileOutputStream = new FileOutputStream("data.bin");
			dataOutputStream = new DataOutputStream(fileOutputStream);

			dataOutputStream.writeInt(125);
			dataOutputStream.writeFloat(150.45F);
			dataOutputStream.writeLong(9090);
			dataOutputStream.writeBoolean(true);

			System.out.println("Successfully written primitive data's to \'data.bin\' file\n");
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