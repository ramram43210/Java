import java.io.IOException;

/*
 * public Process exec(String[] cmdarray) throws
 * 										IOException
 * 
 * Parameters: 
 * -----------
 * 
 * cmdarray - array containing the command to call and
 * its arguments.
 */
public class RuntimeDemo
{

	public static void main(String[] args) throws IOException
	{

		String[] cmdArray = new String[2];

		cmdArray[0] = "notepad.exe";
		cmdArray[1] = "Hello.txt";

		System.out.println("Executing notepad.exe and opening Hello.txt");

		/*
		 * Returns the runtime object associated with the
		 * current Java application.
		 */
		Runtime runtime = Runtime.getRuntime();

		/*
		 * Executes the specified command and arguments in a
		 * separate process.
		 * 
		 * Returns: A new Process object for managing the
		 * subprocess
		 */
		Process process = runtime.exec(cmdArray);

		System.out.println("is process alive = " + process.isAlive());
		System.out.println(cmdArray[1] + " should now open.");
	}

}
