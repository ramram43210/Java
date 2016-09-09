import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/*
 * Here, we have created two threads thread1 and
 * thread2. The thread1 thread writes the data using the
 * PipedOutputStream object and the thread2 thread reads
 * the data from that pipe using the PipedInputStream
 * object. Both the piped stream object are connected
 * with each other.
 */

public class PipedReadWriteDemo
{

	public static void main(String[] args) throws IOException
	{

		final PipedOutputStream pos = new PipedOutputStream();
		final PipedInputStream pis = new PipedInputStream(pos);

		Thread thread1 = new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				try
				{
					String str = "Hello peter, Welcome to india.";
					byte[] byteArray = str.getBytes();
					pos.write(byteArray);
					Thread.sleep(1000);
					pos.close();
				}
				catch (Exception exe)
				{
					exe.printStackTrace();
				}
			}
		});

		Thread thread2 = new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				try
				{
					int data = pis.read();
					while (data != -1)
					{
						System.out.print((char) data);
						data = pis.read();
					}
					pis.close();
				}
				catch (Exception exe)
				{
					exe.printStackTrace();
				}
			}
		});

		thread1.start();
		thread2.start();
	}
}
