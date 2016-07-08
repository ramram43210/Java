import java.io.IOException;

public class JavaIODemo2
{

	public static void main(String[] args)
	{
		try
		{
			System.out.print("Enter the Value = ");
			// returns ASCII code of 1st character
			int intValue = System.in.read();
			System.out.println("intValue = " + intValue);
			System.out.println((char) intValue);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
