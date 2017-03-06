import java.io.IOException;

public class TimeDemo
{

	public static void main(String[] args) throws IOException
	{
		/*
		 * Returns the current value of the system timer, in
		 * nanoseconds
		 */
		System.out.print("time in nanoseconds = ");
		System.out.println(System.nanoTime());

		/*
		 * Returns the current value of the system timer, in
		 * milliseconds
		 */
		System.out.print("time in milliseconds = ");
		System.out.println(System.currentTimeMillis());

	}
}