/*
 * public void trimToSize()
 * 
 * Attempts to reduce storage used for the character
 * sequence. If the buffer is larger than necessary to
 * hold its current sequence of characters, then it may
 * be resized to become more space efficient. Calling
 * this method may, but is not required to, affect the
 * value returned by a subsequent call to the capacity()
 * method.
 */

public class StringBuilderDemo
{

	public static void main(String[] args)
	{

		StringBuilder sb = new StringBuilder("Welcome");
		
		System.out.println("Before timeToSize,Capacity =  "
				+ sb.capacity());

		sb.trimToSize();
		
		System.out.println("After timeToSize,Capacity  =  "
				+ sb.capacity());
	}
}
