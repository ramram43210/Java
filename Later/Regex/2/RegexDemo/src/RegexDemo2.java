import java.util.regex.Pattern;

public class RegexDemo2
{
	public static void main(String[] args)
	{
		boolean result=Pattern.compile(".r").matcher("ar").matches();  
		System.out.println(result);
	}

}