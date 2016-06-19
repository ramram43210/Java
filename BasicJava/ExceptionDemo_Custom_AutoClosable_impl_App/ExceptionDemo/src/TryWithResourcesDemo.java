
public class TryWithResourcesDemo
{

	public static void main(String[] args) throws Exception
	{
		try (MyBufferedReader myBufferedReader = new MyBufferedReader())
		{
			myBufferedReader.read();
		}
	}

}
