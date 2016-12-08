import java.io.IOException;

public class RuntimeDemo
{

	public static void main(String[] args) throws IOException
	{
		/*
		 * Returns the runtime object associated with the
		 * current Java application.
		 */
		Runtime runtime = Runtime.getRuntime();

		System.out.println("Runs the Gargage collector..");
		/*
		 * Runs the garbage collector.
		 * 
		 * Calling this method suggests that the Java
		 * virtual machine expend effort toward recycling
		 * unused objects in order to make the memory they
		 * currently occupy available for quick reuse. When
		 * control returns from the method call, the virtual
		 * machine has made its best effort to recycle all
		 * discarded objects.
		 * 
		 * The name gc stands for "garbage collector". The
		 * virtual machine performs this recycling process
		 * automatically as needed, in a separate thread,
		 * even if the gc method is not invoked explicitly.
		 * 
		 * The method System.gc() is the conventional and
		 * convenient means of invoking this method.
		 */
		runtime.gc();

	}

}
