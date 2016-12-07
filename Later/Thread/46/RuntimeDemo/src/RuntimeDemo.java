import java.io.IOException;

/*
 * public Process exec(String command) throws
 * 										IOException
 *
 * Parameters:
 * -----------
 *
 * command - a specified system command.
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

		/*
		 * Executes the specified string command in a
		 * separate process.
		 *
		 * It will open a new notepad.
		 */
		Process process = runtime.exec("notepad.exe");
		System.out.println("is process alive = " + process.isAlive());
	}

}
