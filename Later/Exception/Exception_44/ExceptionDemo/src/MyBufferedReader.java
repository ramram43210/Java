public class MyBufferedReader implements AutoCloseable
{

	public void read()
	{
		System.out.println("read method is called...");
	}

	@Override
	public void close() throws Exception
	{
		System.out.println("close method is called...");
	}

}
