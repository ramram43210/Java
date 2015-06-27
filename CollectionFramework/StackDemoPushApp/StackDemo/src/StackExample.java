import java.util.Stack;

/*
 Method 

 public E push(E item)

 Parameters:

 item - the item to be pushed onto this stack.

 Returns:

 the item argument.

 */

public class StackExample
{

	public static void main(String[] args)
	{
		Stack<String> stack = new Stack<String>();

		/*
		 * Pushes an item onto the top of this stack. This has exactly the same
		 * effect as: addElement(item)
		 */
		
		stack.push("Apple");
		stack.push("Ball");
		stack.push("Cat");
		stack.push("Dog");
		
		/*
		 * [
		 *  Dog
		 *  Cat
		 *  Ball
		 *  Apple
		 * ]
		 */

		System.out.println("stack : " + stack);
	}

}
