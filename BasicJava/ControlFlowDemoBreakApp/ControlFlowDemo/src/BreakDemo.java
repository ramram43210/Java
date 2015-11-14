class BreakDemo
{
	public static void main(String[] args)
	{

		String[] strArray = { "Apple", "Ball", "Cat", "Dog", "Egg" };

		String searchFor = "Cat";
		boolean foundIt = false;

		/*
		 * This program searches for the String value 'Cat' in an array. The
		 * break statement terminates the for loop when that value is found.
		 * Control flow then transfers to the statement after the for loop.
		 */
		for (String element : strArray)
		{

			if (searchFor.equalsIgnoreCase(element))
			{
				foundIt = true;
				break;
			}
			System.out.println("element inside for :" + element);
		}

		System.out.println("foundIt :" + foundIt);
	}
}