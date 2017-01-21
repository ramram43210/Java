import java.io.IOException;

/*
 * public void exit(int status)
 * 
 * Parameters: 
 * -----------
 * 
 * status - Termination status. By convention, a nonzero
 * status code indicates abnormal termination.
 */
public class RuntimeDemo
{

	public static void main(String[] args) throws IOException
	{
		/*
		 * Returns the runtime object associated with the
		 * current Java application.
		 */
		Runtime runtime = Runtime.getRuntime();

		System.out.println("Before exit method is called..");
		/*
		 * Terminates the currently running Java virtual
		 * machine by initiating its shutdown sequence..
		 */
		runtime.exit(0);

		System.out.println("After exit method is called..");
	}

}
