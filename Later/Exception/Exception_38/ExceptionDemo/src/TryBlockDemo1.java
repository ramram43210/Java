
public class TryBlockDemo1
{

	public static void main(String[] args)
	{
		
		try
		{
			String str = null;
			
			// This line will throw NullPointerException
			System.out.println(str.length());
		}
		
		catch (NullPointerException nullPointerException)
		{
			nullPointerException.printStackTrace();
		}
		
		try
		{
		
			// This line will throw ArithmeticException
			int a = 5/0;
			
		}
		
		catch (ArithmeticException arithmeticException)
		{
			arithmeticException.printStackTrace();
		}
		
		System.out.println("Normal flow---");		

	}
}
