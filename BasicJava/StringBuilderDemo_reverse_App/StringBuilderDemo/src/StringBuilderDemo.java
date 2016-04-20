/*
 * public StringBuilder reverse()
 *  
 * Returns: 
 * -------- 
 * a reference to this object.
 */
public class StringBuilderDemo
{

	public static void main(String[] args)
	{
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println(sb);
		sb = sb.reverse();
		System.out.println(sb);
	}
}