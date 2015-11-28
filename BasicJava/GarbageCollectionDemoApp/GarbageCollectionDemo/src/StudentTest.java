public class StudentTest
{

	public static void main(String[] args) throws InterruptedException
	{
		Student johnReferenceVariable = new Student("John", 25);
		Student peterReferenceVariable = new Student("Peter", 25);

		/*
		 * Now the object referred by johnReferenceVariable is available for
		 * garbage collection
		 */
		johnReferenceVariable = null;

		/*
		 * Now the object referred by peterReferenceVariable is available for
		 * garbage collection
		 */
		peterReferenceVariable = null;

		/*
		 * The gc() method is used to invoke the garbage collector to perform
		 * cleanup processing. The gc() is found in System and Runtime classes.
		 */

		System.gc();

		Thread.sleep(100);

	}

}
