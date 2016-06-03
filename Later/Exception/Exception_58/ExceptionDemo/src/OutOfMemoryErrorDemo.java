
public class OutOfMemoryErrorDemo
{

	public static void main(String[] args)
	{
		int[] matrix = new int[Integer.MAX_VALUE];
		
		for(int i = 0; i < matrix.length; ++i)
		{
			matrix[i] = i+1;
		}
	}

}
