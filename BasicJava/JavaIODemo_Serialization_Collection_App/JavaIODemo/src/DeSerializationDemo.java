import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DeSerializationDemo
{

	public static void main(String[] args) throws FileNotFoundException,
			IOException, ClassNotFoundException
	{
		DeSerializationDemo deSerializationDemo = new DeSerializationDemo();
		deSerializationDemo.readEmployeeObject();
	}

	private void readEmployeeObject() throws IOException,
			FileNotFoundException, ClassNotFoundException
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
			ArrayList<Employee> listOfEmployees = (ArrayList<Employee>) objectInputStream
																			.readObject();
			System.out
					.println("Successfully read list of employee objects from the file.\n");

			for (Employee employee : listOfEmployees)
			{
				System.out.println("Id  = " + employee.getId());
				System.out.println("Name = " + employee.getName());
				System.out.println("--------------------------");
			}

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
