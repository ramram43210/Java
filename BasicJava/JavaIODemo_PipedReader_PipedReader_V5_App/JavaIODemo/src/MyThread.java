import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

class MyThread extends Thread
{

	private PipedReader pr;
	private PipedWriter pw;

	MyThread(String name, PipedReader pr, PipedWriter pw)
	{

		super(name);
		this.pr = pr;
		this.pw = pw;
	}

	@Override
	public void run()
	{

		try
		{
			if (getName().equals("Thread 1"))
			{
				for (int cnt = 0; cnt < 15; cnt++)
				{
					pw.write("Welcome " + cnt + "\n");
				}
				pw.close();
			}
			else
			{

				int data;
				while ((data = pr.read()) != -1)
				{
					System.out.print((char) data);
				}
				pr.close();
			}

		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}