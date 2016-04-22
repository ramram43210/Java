/*
 * public void ensureCapacity(int minimumCapacity)
 * 
 * Parameters: 
 * ---------- 
 * minimumCapacity - the minimum desired capacity
 */
public class StringBuilderDemo
{

	public static void main(String[] args)
	{
		StringBuilder sb = new StringBuilder();
		// default 16
		System.out.println("Old capacity = "+sb.capacity());

		sb.ensureCapacity(40);

		System.out.println("New Capacity = "+sb.capacity());
	}
}
