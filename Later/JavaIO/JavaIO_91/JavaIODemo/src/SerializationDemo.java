import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializationDemo
{

	public static void main(String[] args) throws FileNotFoundException,
			IOException, ClassNotFoundException
	{
		SerializationDemo serializationDemo = new SerializationDemo();
		serializationDemo.writeEmployeeObject();
		serializationDemo.readEmployeeObject();
	}

	private void writeEmployeeObject() throws FileNotFoundException,
			IOException
	{
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;
		try
		{
			fileOutputStream = new FileOutputStream("employee.tmp");
			objectOutputStream = new ObjectOutputStream(fileOutputStream);

			Employee employee1 = new Employee(101, "Peter", 32);
			Employee employee2 = new Employee(102, "Dave", 32);
			Employee employee3 = new Employee(103, "Ram", 32);

			ArrayList<Employee> listOfEmployees = new ArrayList<Employee>();
			listOfEmployees.add(employee1);
			listOfEmployees.add(employee2);
			listOfEmployees.add(employee3);

			/*
			 * Write the specified object to the
			 * ObjectOutputStream.
			 */
			objectOutputStream.writeObject(listOfEmployees);
			System.out
					.println("Successfully written list of employee objects to the file.\n");
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
