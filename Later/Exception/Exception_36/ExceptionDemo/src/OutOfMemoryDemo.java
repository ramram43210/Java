
public class OutOfMemoryDemo
{

	public static void main(String[] args)
	{
		String str = "Hello";
		while(true)
		{
			str = str+"Welcome to india";
			System.out.println(str);
		}

	}

}
