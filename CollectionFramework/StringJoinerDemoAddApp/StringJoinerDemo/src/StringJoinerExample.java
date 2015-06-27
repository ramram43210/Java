import java.util.StringJoiner;

/*
 Method 

 public StringJoiner add(CharSequence newElement)

 Parameters:

 newElement - The element to add

 Returns:

 a reference to this StringJoiner

 */

public class StringJoinerExample
{

	public static void main(String[] args)
	{
		// Only delimiter example
		StringJoiner stringJoiner = new StringJoiner(":");

		/*
		 * Adds a copy of the given CharSequence value as the next element of
		 * the StringJoiner value. If newElement is null, then "null" is added.
		 */
		stringJoiner.add("Java").add("Scala").add("Groovy");
		
		System.out.println("Delimeter Only:  " + stringJoiner
				+ System.lineSeparator());

		// Delimiter with prefix and suffix example
		stringJoiner = new StringJoiner(":", "[", "]");
		
		stringJoiner.add("Java").add("Scala").add("Groovy");
		
		System.out.println("Delimeter, Suffix and Prefix Example :  "
				+ stringJoiner + System.lineSeparator());

		// Finding the total length of string joiner
		System.out.println("Length of StringJoiner : " + stringJoiner.length());

	}

}
