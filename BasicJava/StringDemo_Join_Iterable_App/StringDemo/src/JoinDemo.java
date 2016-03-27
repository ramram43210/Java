import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/*
 * public static String join(CharSequence delimiter,
 *              Iterable<? extends CharSequence> elements)
 * 
 * Parameters: 
 * ----------- 
 * delimiter - a sequence of characters that is used
 * to separate each of the elements in the resulting
 * String 
 * 
 * elements - an Iterable that will have its
 * elements joined together.
 * 
 * Returns: 
 * -------- 
 * a new String that is composed from the elements
 * argument
 * 
 * Throws: 
 * ------- 
 * NullPointerException - If delimiter or elements
 * is null
 */

public class JoinDemo
{
	public static void main(String[] args)
	{
		List<String> listOfStrings = new LinkedList<>();
		listOfStrings.add("Java");
		listOfStrings.add("is");
		listOfStrings.add("cool");

		// message returned is: "Java|is|cool"
		String message = String.join("|", listOfStrings);
		System.out.println(message);

		Set<String> setOfStrings = new LinkedHashSet<>();
		setOfStrings.add("Java");
		setOfStrings.add("is");
		setOfStrings.add("very");
		setOfStrings.add("cool");

		// message returned is: "Java-is-very-cool"
		message = String.join("-", setOfStrings);
		System.out.println(message);
	}

}