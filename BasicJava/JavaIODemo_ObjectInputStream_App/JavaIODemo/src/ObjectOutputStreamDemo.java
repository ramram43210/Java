import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo
{

	public static void main(String[] args) throws FileNotFoundException,
			IOException, ClassNotFoundException
	{
		ObjectOutputStreamDemo objectOutputStreamDemo = new ObjectOutputStreamDemo();
		objectOutputStreamDemo.writeStudentObject();
	}

	private void writeStudentObject() throws FileNotFoundException, IOException
	{
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;
		try
		{
			fileOutputStream = new FileOutputStream("student.tmp");
			objectOutputStream = new ObjectOutputStream(fileOutputStream);

			Student student = new Student("Peter", 15);
			System.out.println(student);

			/*
			 * Write the specified object to the
			 * ObjectOutputStream.
			 */
			objectOutputStream.writeObject(student);
			System.out
					.println("Successfully written student object to the file.\n");
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
