import java.io.IOException;

/*
 * public Process exec(String command, String[] envp)
 * 										throws IOException
 *
 * Parameters:
 * -----------
 *
 * command - a specified system command.
 *
 * envp - array of strings, each element of which has
 * environment variable settings in the format
 * name=value, or null if the subprocess should inherit
 * the environment of the current process.
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
		 * separate process with the specified environment.
		 *
		 * It will open a new notepad.
		 */
		Process process = runtime.exec("notepad.exe",null);
		System.out.println("is process alive = " + process.isAlive());
	}

}
