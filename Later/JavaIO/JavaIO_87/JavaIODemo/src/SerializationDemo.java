import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo
{

	public static void main(String[] args) throws FileNotFoundException,
			IOException, ClassNotFoundException
	{
		SerializationDemo serializationDemo = new SerializationDemo();
		serializationDemo.writeEmployeeObject();
		serializationDemo.readEmployeeObject();
	}

	private void writeEmployeeObject() throws FileNotFoundException, IOException
	{
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;
		try
		{
			fileOutputStream = new FileOutputStream("employee.tmp");
			objectOutputStream = new ObjectOutputStream(fileOutputStream);

			Employee employee = new Employee("Peter",29,80000);

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

	private void readEmployeeObject() throws IOException, FileNotFoundException,
			ClassNotFoundException
	{
		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;

		try
		{
			fileInputStream = new FileInputStream("employee.tmp");
			objectInputStream = new ObjectInputStream(fileInputStream);

			/*
			 * Read an object from the ObjectInputStream.
			 */
			Employee employee = (Employee) objectInputStream.readObject();

			System.out
					.println("Successfully read employee object from the file.");

			System.out.println("Name = " + employee.getName());
			System.out.println("Age  = " + employee.getAge());
			System.out.println("Salary  = " + employee.getSalary());
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
