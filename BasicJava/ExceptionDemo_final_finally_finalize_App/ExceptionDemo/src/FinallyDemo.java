public class FinallyDemo
{

	public static void main(String[] args)
	{
		try
		{
			String str = "Peter";
			System.out.println("str = "+str);
		}
		catch (Exception exe)
		{
			exe.printStackTrace();
		}
		finally
		{
			System.out.println("finally block is executed");
		}
	}

}
