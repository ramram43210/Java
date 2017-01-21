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
		 * Returns: the maximum number of processors
		 * available to the virtual machine; never smaller
		 * than one
		 */
		int availableProcessors = runtime.availableProcessors();
		System.out.println("availableProcessors = "+availableProcessors);
	}

}
