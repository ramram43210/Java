public class DataStructure
{

	// Create an array
	private final static int SIZE = 6;
	private int[] arrayOfInts = new int[SIZE];

	public DataStructure()
	{
		// fill the array with ascending integer values
		for (int i = 0; i < SIZE; i++)
		{
			arrayOfInts[i] = i;
		}
	}

	public void printOdd()
	{

		// Print out values of even indices of the array
		DataStructureIterator iterator = this.new OddIterator();
		while (iterator.hasNext())
		{
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
	}

	interface DataStructureIterator extends java.util.Iterator<Integer>
	{
	}

	// Inner class implements the DataStructureIterator interface,
	// which extends the Iterator<Integer> interface
	// we can use inner classes to implement helper classes.

	private class OddIterator implements DataStructureIterator
	{

		// Start stepping through the array from the beginning
		private int nextIndex = 1;

		public boolean hasNext()
		{

			// Check if the current element is the last in the array
			return (nextIndex <= SIZE - 1);
		}

		// Return the odd element.
		public Integer next()
		{
			Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);
			nextIndex += 2;
			return retValue;
		}
	}

}