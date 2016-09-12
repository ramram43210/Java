import java.io.PipedReader;
import java.io.PipedWriter;

/*
 * We have created a thread, MyThread that extends the
 * Thread. It has a PipedReader and a PipedWriter
 * property. It overrides the run() API method of
 * Thread. In the method, according to the thread name,
 * it uses either the PipedReader to read or the
 * PipedWriter to write
 */

public class PipedReadWriteDemo
{

	public static void main(String[] args) throws Exception
	{

		/*
		 * The PipedWriter is a class for writing to piped
		 * character-output streams.
		 */
		PipedWriter pw = new PipedWriter();
		/*
		 * The PipedReader is a class for reading piped
		 * character-input streams,
		 */
		PipedReader pr = new PipedReader(pw);

		MyThread mt1 = new MyThread("Thread 1", pr, pw);
		MyThread mt2 = new MyThread("Thread 2", pr, pw);

		mt1.start();
		Thread.sleep(2000);
		mt2.start();
	}
}