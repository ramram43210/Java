public class MyException extends Exception
{

	public MyException(String message)
	{
		super(message);
	}
	
	public MyException(Throwable throwable)
	{
		super(throwable);
	}

	public MyException(String message, Throwable throwable)
	{
		super(message, throwable);
	}

}
