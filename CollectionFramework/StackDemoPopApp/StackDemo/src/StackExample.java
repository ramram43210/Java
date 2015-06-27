import java.util.Stack;

/*
 Method 

 public E pop()

 Returns:

 The object at the top of this stack (the last item of the Vector object).

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

		System.out.println("Before pop method is called : stack - " + stack+"\n");

		/*
		 * Removes the object at the top of this stack and returns that object
		 * as the value of this function.
		 */
		String object = stack.pop();

		System.out.println("object : " + object+"\n");

		System.out.println("After pop method is called :stack - " + stack);

	}

}
