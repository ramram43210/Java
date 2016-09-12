import java.io.PipedReader;
 
public class PipeReaderThread implements Runnable
{
	private PipedReader pr;
	private String name = null;

	public PipeReaderThread(String name, PipedReader pr)
	{
		this.name = name;
		this.pr = pr;
	}

	public void run()
	{
		try
		{
			// continuously read data from stream and print
			// it in console
			while (true)
			{
				char c = (char) pr.read(); // read a char
				if (c != -1)
				{ // check for -1 indicating end of file
					System.out.print(c);
				}
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
