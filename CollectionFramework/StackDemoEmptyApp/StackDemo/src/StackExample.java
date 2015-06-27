import java.util.Stack;

/*
 Method 

 public boolean empty()

 Returns:

 true if and only if this stack contains no items; false otherwise.

 */

public class StackExample
{

	public static void main(String[] args)
	{
		Stack<String> stack = new Stack<String>();

		System.out.println("stack : " + stack );
		
		/*
		 * Tests if this stack is empty.
		 */
		boolean isStackEmpty = stack.empty();

		System.out.println("is stack empty : " + isStackEmpty + "\n");

		stack.push("Apple");
		stack.push("Ball");
		stack.push("Cat");
		stack.push("Dog");

		System.out.println("stack : " + stack );
		
		
		/*
		 * Tests if this stack is empty.
		 */
		isStackEmpty = stack.empty();

		System.out.println("is stack empty : " + isStackEmpty + "\n");
	}

}
