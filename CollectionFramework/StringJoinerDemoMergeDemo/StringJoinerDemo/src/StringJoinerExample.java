import java.util.StringJoiner;

/*
 Method 

 public StringJoiner merge(StringJoiner other)

 Parameters:

 other - The StringJoiner whose contents should be merged into this one

 Returns:

 This StringJoiner

 */

public class StringJoinerExample
{

	public static void main(String[] args)
	{
		StringJoiner stringJoiner1 = new StringJoiner(":", "[", "]");

		stringJoiner1.add("Java").add("Scala").add("Groovy");

		System.out.println("stringJoiner1 :  "
				+ stringJoiner1 + System.lineSeparator());

		StringJoiner stringJoiner2 = new StringJoiner(",");
		stringJoiner2.add("Apple").add("Ball");
		
		System.out.println("stringJoiner2 :  "
				+ stringJoiner2 + System.lineSeparator());

		/*
		 * Adds the contents of the given StringJoiner without prefix and suffix
		 * as the next element if it is non-empty. If the given StringJoiner is
		 * empty, the call has no effect.
		 * 
		 * If the other StringJoiner is using a different delimiter, then
		 * elements from the other StringJoiner are concatenated with that
		 * delimiter and the result is appended to this StringJoiner as a single
		 * element.
		 */
		stringJoiner2.merge(stringJoiner1);

		System.out.println("stringJoiner2 afterMerge with stringJoiner1 : "
				+ stringJoiner2);
	}

}
