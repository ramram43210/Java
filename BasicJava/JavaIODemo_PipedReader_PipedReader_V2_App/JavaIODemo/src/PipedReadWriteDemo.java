import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

/*
 * Here, we have created two threads thread1 and
 * thread2. The thread1 thread writes the data using the
 * PipedWriter object and the thread2 thread reads the
 * data from that pipe using the PipedReader object.
 * Both the pipedWriter and pipedreader objects are
 * connected with each other.
 */
public class PipedReadWriteDemo
{

	public static void main(String[] args) throws IOException
	{

		final PipedWriter pw = new PipedWriter();
		final PipedReader pr = new PipedReader(pw);

		Thread thread1 = new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				try
				{
					pw.write("Hello peter, Welcome to india.");
					Thread.sleep(1000);
				}
				catch (Exception exe)
				{
					exe.printStackTrace();
				}
				try
				{
					pw.close();
				}
				catch (IOException e)
				{
					e.printStackTrace();
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
					int data = pr.read();
					while (data != -1)
					{
						System.out.print((char) data);
						data = pr.read();
					}

				}
				catch (Exception exe)
				{
					exe.printStackTrace();
				}
				try
				{
					pr.close();
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		});

		thread1.start();
		thread2.start();

	}
}
