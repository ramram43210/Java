import java.util.Stack;

/*
 Method 

 public E peek()

 Returns:
 
 the object at the top of this stack (the last item of the Vector object).
 
 Throws:
 
 EmptyStackException - if this stack is empty.

 */

public class StackExample
{

	public static void main(String[] args)
	{
		Stack<String> stack = new Stack<String>();

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

		System.out.println("Before peek() method is called : stack : " + stack + "\n");

		/*
		 * Looks at the object at the top of this stack without removing it from
		 * the stack.
		 */
		String object = stack.peek();

		System.out.println("object : " + object + "\n");

		System.out.println("After peek() method is called : stack : " + stack);

	}

}
