import java.io.IOException;

public class SynchronizationDemo
{

	public static void main(String[] args) throws IOException
	{
		Table tableObj = new Table();
		Thread1 t1 = new Thread1(tableObj,"Thread 1");
		Thread2 t2 = new Thread2(tableObj,"Thread 2");
		t1.start();
		t2.start();
	}

}
