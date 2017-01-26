import java.io.File;
import java.io.IOException;

/*
 * public Process exec(String command, String[] envp,
 * 								File dir) throws IOException
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
 * 
 * dir - the working directory of the subprocess, or
 * null if the subprocess should inherit the working
 * directory of the current process.
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
		 * Create a file with the working directory we wish
		 */
		File dir = new File("D:/Work/");

		/*
		 * Executes the specified string command in a
		 * separate process with the specified environment
		 * and working directory.
		 * 
		 * It will open a new notepad.
		 */
		Process process = runtime.exec("notepad.exe", null, dir);
		System.out.println("is process alive = " + process.isAlive());
	}

}
