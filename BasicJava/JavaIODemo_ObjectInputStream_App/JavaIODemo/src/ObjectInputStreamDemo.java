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
		objectInputStreamDemo.readStudentObject();
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

			System.out.println(student);
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
