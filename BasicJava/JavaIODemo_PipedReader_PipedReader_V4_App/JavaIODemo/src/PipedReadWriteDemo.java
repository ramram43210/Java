import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class PipedReadWriteDemo
{

	public static void main(String[] args) throws IOException
	{
		PipedReader pr = new PipedReader();
		PipedWriter pw = new PipedWriter();
		pw.connect(pr);

		Runnable producer = () -> produceData(pw);
		Runnable consumer = () -> consumeData(pr);
		new Thread(producer).start();
		new Thread(consumer).start();
	}

	public static void produceData(PipedWriter pw)
	{
		try
		{
			for (int i = 1; i <= 5; i++)
			{
				pw.write("Welcome " + i+"\n");
				pw.flush();
				Thread.sleep(500);
			}
			pw.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void consumeData(PipedReader pr)
	{
		try
		{
			int num = -1;
			while ((num = pr.read()) != -1)
			{
				System.out.print((char) num);
			}
			pr.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}
}
