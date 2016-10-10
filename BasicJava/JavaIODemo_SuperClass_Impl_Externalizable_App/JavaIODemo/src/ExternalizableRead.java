import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ExternalizableRead
{

	public static void main(String[] args) throws FileNotFoundException,
			IOException, ClassNotFoundException
	{
		ExternalizableRead externalizableRead = new ExternalizableRead();
		externalizableRead.readEmployeeObject();
	}

	private void readEmployeeObject() throws IOException,
			FileNotFoundException, ClassNotFoundException
	{
		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;
		//Deserialize 
		try
		{
			fileInputStream = new FileInputStream("employee.ser");
			objectInputStream = new ObjectInputStream(fileInputStream);

			/*
			 * Read an object from the ObjectInputStream.
			 */
			Employee employee = (Employee) objectInputStream.readObject();
			System.out
					.println("Successfully read employee object from the file.\n");

			System.out.println("After DeSerializing.");
			System.out.println(employee.toString());

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
