import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo
{

	public static void main(String[] args) throws FileNotFoundException,
			IOException, ClassNotFoundException
	{
		ObjectOutputStreamDemo objectOutputStreamDemo = new ObjectOutputStreamDemo();
		objectOutputStreamDemo.writeEmployeeObject();
		objectOutputStreamDemo.readEmployeeObject();
	}

	private void writeEmployeeObject() throws FileNotFoundException,
			IOException
	{
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;
		try
		{
			fileOutputStream = new FileOutputStream("employee.txt");
			objectOutputStream = new ObjectOutputStream(fileOutputStream);

			Employee employee = new Employee(20, "Peter");

			/*
			 * Write the specified object to the
			 * ObjectOutputStream.
			 */
			objectOutputStream.writeObject(employee);
			System.out
					.println("Successfully written employee object to the file.\n");
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

			System.out.println("Id = " + employee.getId());
			System.out.println("Name = " + employee.getName());
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
