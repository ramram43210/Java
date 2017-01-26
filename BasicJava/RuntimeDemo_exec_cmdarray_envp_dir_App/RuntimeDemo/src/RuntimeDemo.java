import java.io.File;
import java.io.IOException;

/*
 * public Process exec(String[] cmdarray, String[] envp,
 * 								File dir) throws IOException
 * 
 * Parameters: 
 * -----------
 * 
 * cmdarray - array containing the command to call and
 * its arguments.
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

		String[] cmdArray = new String[2];

		cmdArray[0] = "notepad.exe";
		cmdArray[1] = "Hello.txt";

		System.out.println(
				"Executing notepad.exe and opening Hello.txt");

		/*
		 * Returns the runtime object associated with the
		 * current Java application.
		 */
		Runtime runtime = Runtime.getRuntime();

		File dir = new File("D:/work");
		/*
		 * Executes the specified string command in a
		 * separate process with the specified environment
		 * and working directory.
		 * 
		 * Returns: A new Process object for managing the
		 * subprocess
		 */
		Process process = runtime.exec(cmdArray, null, dir);

		System.out.println("is process alive = " + process.isAlive());
		System.out.println(cmdArray[1] + " should now open.");
	}

}
