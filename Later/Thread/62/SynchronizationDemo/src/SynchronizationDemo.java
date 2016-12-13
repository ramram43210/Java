import java.io.IOException;

public class SynchronizationDemo
{

	public static void main(String[] args) throws IOException
	{
		Table tableObj = new Table();
		Thread1 t1 = new Thread1(tableObj);
		Thread2 t2 = new Thread2(tableObj);
		t1.start();
		t2.start();
	}

}
