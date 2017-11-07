import java.util.regex.Pattern;


public class RegexDemo2
{
	public static void main(String[] args)
	{
		/*
		 *  {X} = Occurs X number of times, {} 
		 *  describes the order of the preceding liberal
		 */
		System.out.println(Pattern.matches("X{3}", "X")); // false
		System.out.println(Pattern.matches("X{3}", "XXX")); // true
		System.out.println(Pattern.matches("X{3}", "aaaa")); // false
		
		System.out.println("-------------------------------");
		
		System.out.println(Pattern.matches("\\d{3}", "989")); // true
		System.out.println(Pattern.matches("\\d{3}", "9898")); // false
		
		System.out.println("-------------------------------");
		
		System.out.println(Pattern.matches(".{10}", "99999aaaaa")); // true
		System.out.println(Pattern.matches(".{10}", "99999")); // false
		
				
	}

}