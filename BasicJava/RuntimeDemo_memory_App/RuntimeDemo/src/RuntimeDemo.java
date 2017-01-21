public class RuntimeDemo
{
	public static void main(String[] args)
	{
		/*
		 * Returns the runtime object associated with the
		 * current Java application.
		 */
		Runtime runtime = Runtime.getRuntime();
		/*
		 * Returns the total amount of memory in the Java
		 * virtual machine.
		 */
		System.out.println("Total Memory: " + runtime.totalMemory());
		/*
		 * Returns the amount of free memory in the Java
		 * Virtual Machine.Calling the gc method may result
		 * in increasing the value returned by freeMemory.
		 */
		System.out.println("Free Memory: " + runtime.freeMemory());
		/*
		 * Returns the maximum amount of memory that the
		 * Java virtual machine will attempt to use.
		 */
		System.out.println("max Memory: " + runtime.maxMemory());
	}
}
