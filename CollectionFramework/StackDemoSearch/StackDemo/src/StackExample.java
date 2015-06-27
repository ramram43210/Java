import java.util.Stack;

/*
 Method 

 public int search(Object o)

 Parameters:
 
 o - the desired object.

 Returns:
 
 the 1-based position from the top of the stack where the object is located; 
 the return value -1 indicates that the object is not on the stack.

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

		System.out.println("stack : " + stack + "\n");

		/*
		 * Returns the 1-based position where an object is on this stack. If the
		 * object o occurs as an item in this stack, this method returns the
		 * distance from the top of the stack of the occurrence nearest the top
		 * of the stack; the topmost item on the stack is considered to be at
		 * distance 1. The equals method is used to compare o to the items in
		 * this stack.
		 * 
		 * Stack [ 
		 * Dog   - 1 
		 * Cat   - 2 
		 * Ball  - 3 
		 * Apple - 4 ]
		 */
		int position = stack.search("Cat"); 
		System.out.println("position of 'Cat' : " + position + "\n");
		
		
		position = stack.search("Ball"); 
		System.out.println("position of 'Ball' : " + position + "\n");
		
	}

}
