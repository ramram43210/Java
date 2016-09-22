import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo
{

	public static void main(String[] args) throws FileNotFoundException,
			IOException, ClassNotFoundException
	{
		ObjectInputStreamDemo objectInputStreamDemo = new ObjectInputStreamDemo();
		objectInputStreamDemo.readEmployeeObject();
	}

	private void readEmployeeObject() throws IOException,
			FileNotFoundException, ClassNotFoundException
	{
		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;

		try
		{
			fileInputStream = new FileInputStream("employee.txt");
			objectInputStream = new ObjectInputStream(fileInputStream);

			/*
			 * Read an object from the ObjectInputStream.
			 */
			Employee employee = (Employee) objectInputStream.readObject();

			System.out
					.println("Successfully read employee object from the file.");
			System.out.println(employee);
			System.out.println("Name = " + employee.getName());
			System.out.println("Id = " + employee.getId());
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
