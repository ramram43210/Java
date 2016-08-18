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
		objectOutputStreamDemo.writeStudentObject();
		objectOutputStreamDemo.readStudentObject();
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

	private void readStudentObject() throws IOException, FileNotFoundException,
			ClassNotFoundException
	{
		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;

		try
		{
			fileInputStream = new FileInputStream("student.tmp");
			objectInputStream = new ObjectInputStream(fileInputStream);

			/*
			 * Read an object from the ObjectInputStream.
			 */
			Student student = (Student) objectInputStream.readObject();

			System.out
					.println("Successfully read student object from the file.");

			System.out.println("Name = " + student.getName());
			System.out.println("Age  = " + student.getAge());
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
