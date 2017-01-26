import java.io.IOException;

/*
 * public void halt(int status)
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

		System.out.println("Before halt method is called..");
		/*
		 * Forcibly terminates the currently running Java
		 * virtual machine.
		 * 
		 * This method should be used with extreme caution.
		 * Unlike the exit method, this method does not
		 * cause shutdown hooks to be started and does not
		 * run uninvoked finalizers if finalization-on-exit
		 * has been enabled. If the shutdown sequence has
		 * already been initiated then this method does not
		 * wait for any running shutdown hooks or finalizers
		 * to finish their work.
		 */
		runtime.halt(0);
		System.out.println("After halt method is called..");
	}

}
