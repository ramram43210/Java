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

		final PipedOutputStream pout = new PipedOutputStream();
		final PipedInputStream pin = new PipedInputStream();

		/*
		 * Connects this piped output stream to a receiver.
		 * If this piped output stream object is already
		 * connected to some other piped input stream, an
		 * IOException is thrown.
		 */
		pout.connect(pin);
		/*
		 * Creating one thread1 which writes the data
		 */
		Thread thread1 = new Thread()
		{
			public void run()
			{
				try
				{
					for (int i = 50; i <= 60; i++)
					{

						pout.write(i);
						System.out.println("PipedOutputStream Writing i =" + i);
						Thread.sleep(1000);
					}
					pout.close();

				}

				catch (Exception exe)
				{
					exe.printStackTrace();
				}
				
			}
		};
		/*
		 * Creating another thread2 which reads the data.
		 */
		Thread thread2 = new Thread()
		{
			public void run()
			{
				try
				{
					int i;
					while ((i = pin.read()) != -1)
					{
						System.out.println("PipedInputStream Reading i = " + i);
					}
					pin.close();
				}
				catch (Exception exe)
				{
					exe.printStackTrace();
				}
			}
		};
		// starting both threads
		thread1.start();
		thread2.start();
	}
}
