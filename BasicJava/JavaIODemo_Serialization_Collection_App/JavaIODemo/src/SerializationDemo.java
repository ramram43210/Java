import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializationDemo
{

	public static void main(String[] args) throws FileNotFoundException,
			IOException, ClassNotFoundException
	{
		SerializationDemo serializationDemo = new SerializationDemo();
		serializationDemo.writeEmployeeObject();
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

			Employee employee1 = new Employee(101, "Peter");
			Employee employee2 = new Employee(102, "Dave");
			Employee employee3 = new Employee(103, "Ram");

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

}
