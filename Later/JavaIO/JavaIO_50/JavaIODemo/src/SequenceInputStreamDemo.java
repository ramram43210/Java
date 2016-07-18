import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputStreamDemo
{

	public static void main(String[] args) throws IOException
	{
		FileInputStream fileInputStream1 = null;
		FileInputStream fileInputStream2 = null;
		SequenceInputStream sequenceInputStream = null;

		try
		{
			fileInputStream1 = new FileInputStream("myfile1.txt");
			fileInputStream2 = new FileInputStream("myfile2.txt");

			sequenceInputStream = new SequenceInputStream(fileInputStream1,
															  fileInputStream2);
			int i;
			while ((i = sequenceInputStream.read()) != -1)
			{
				System.out.print((char) i);
			}
		}
		finally
		{
			if(fileInputStream1!=null)
			{
				fileInputStream1.close();
			}
			if(fileInputStream2!=null)
			{
				fileInputStream2.close();
			}
			if(sequenceInputStream!=null)
			{
				sequenceInputStream.close();
			}
		}
	}

}
