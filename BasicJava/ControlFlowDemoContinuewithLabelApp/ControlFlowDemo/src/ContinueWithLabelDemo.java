public class ContinueWithLabelDemo
{
	public static void main(String[] args)
	{

		/*
		 * A labeled continue statement skips the current iteration of an outer
		 * loop marked with the given label.
		 */

		outer: for (int i = 0; i < 2; i++)
		{
			System.out.println("\n" + "i : " + i + "\n");
			for (int j = 0; j < 3; j++)
			{
				if (j == 1)
				{
					continue outer;
				}
				System.out.println("j : " + j);
			}

			System.out.println("------------------------------");
		}

	}
}