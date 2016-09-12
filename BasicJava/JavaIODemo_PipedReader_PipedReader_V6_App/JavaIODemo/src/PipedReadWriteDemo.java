import java.io.PipedReader;
import java.io.PipedWriter;

/*
 * Pipe streams are just like real plumbing pipes. You
 * put things into to a pipe at one end – using some
 * methods. Then you receive the same things back from
 * the pipe stream at the other end – using some other
 * methods. They come out in FIFO order, first-in
 * first-out, just like from real plumbing pipes.
 */

public class PipedReadWriteDemo
{

	public static void main(String[] args) throws Exception
	{
		try
		{
			// Create writer and reader instances
			PipedReader pr = new PipedReader();
			PipedWriter pw = new PipedWriter();
			// Connect the writer with reader
			pw.connect(pr);
			// Create one writer thread and one reader
			// thread
			Thread thread1 = new Thread(
					new PipeReaderThread("ReaderThread", pr));
			Thread thread2 = new Thread(
					new PipeWriterThread("WriterThread", pw));
			// start both threads
			thread1.start();
			thread2.start();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}