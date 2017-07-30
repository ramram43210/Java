import java.util.regex.Pattern;

public class RegexDemo
{
	public static void main(String[] args)
	{
		System.out.println(Pattern.matches(".r", "ar"));//true (2nd char is r)  
		System.out.println(Pattern.matches(".r", "ak"));//false (2nd char is not r)  
		System.out.println(Pattern.matches(".r", "arr"));//false (has more than 2 char)  
		System.out.println(Pattern.matches(".r", "arrr"));//false (has more than 2 char)  
		System.out.println(Pattern.matches("..r", "par"));//true (3rd char is r)  
	}

}