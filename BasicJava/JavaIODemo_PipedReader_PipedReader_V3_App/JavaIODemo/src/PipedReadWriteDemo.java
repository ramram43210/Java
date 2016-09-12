import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PipedReadWriteDemo
{

	final static PipedWriter pw = new PipedWriter();
	final static PipedReader pr = new PipedReader();

	class PipedOutputThread implements Runnable
	{
		@Override
		public void run()
		{
			for (int i = 1; i <= 5; i++)
			{
				try
				{
					pw.write("Welcome " + i + "\n");
					Thread.sleep(1000);
				}
				catch (IOException e)
				{
					e.printStackTrace();
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
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
	}

	class PipedInputThread implements Runnable
	{
		@Override
		public void run()
		{
			try
			{
				int i = 0;
				while ((i = pr.read()) != -1)
				{
					System.out.print((char) i);
				}
			}
			catch (IOException e)
			{
				e.printStackTrace();
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
	}

	public static void main(String[] args)
	{
		try
		{
			pw.connect(pr);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		ExecutorService service = Executors.newFixedThreadPool(2);
		PipedReadWriteDemo pipedWriteReadDemo = new PipedReadWriteDemo();
		service.execute(pipedWriteReadDemo.new PipedOutputThread());
		service.execute(pipedWriteReadDemo.new PipedInputThread());
	}
}
