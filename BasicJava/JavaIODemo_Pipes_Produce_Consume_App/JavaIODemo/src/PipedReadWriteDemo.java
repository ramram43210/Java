import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedReadWriteDemo
{

	public static void main(String[] args) throws IOException
	{
		PipedInputStream pis = new PipedInputStream();
		PipedOutputStream pos = new PipedOutputStream();
		pos.connect(pis);

		Runnable producer = () -> produceData(pos);
		Runnable consumer = () -> consumeData(pis);
		new Thread(producer).start();
		new Thread(consumer).start();
	}

	public static void produceData(PipedOutputStream pos)
	{
		try
		{
			for (int i = 1; i <= 5; i++)
			{
				pos.write((byte) i);
				pos.flush();
				System.out.println("Writing: " + i);
				Thread.sleep(500);
			}
			pos.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void consumeData(PipedInputStream pis)
	{
		try
		{
			int num = -1;
			while ((num = pis.read()) != -1)
			{
				System.out.println("Reading: " + num);
			}
			pis.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}
}
