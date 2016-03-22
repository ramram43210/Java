public class RegionMatchesDemo
{
	public static void main(String[] args)
	{
		String searchMe = "Red Eggs and Ham";
		String findMe = "Eggs";
		int searchMeLength = searchMe.length();
		int findMeLength = findMe.length();
		boolean foundIt = false;
		/*
		 * The program steps through the string referred to
		 * by searchMe one character at a time. For each
		 * character, the program calls the regionMatches
		 * method to determine whether the substring
		 * beginning with the current character matches the
		 * string the program is looking for.
		 */
		for (int i = 0; i <= (searchMeLength - findMeLength); i++)
		{
			if (searchMe.regionMatches(i, findMe, 0, findMeLength))
			{
				foundIt = true;
				System.out.println("foundIt = " + foundIt);
				System.out.println(searchMe.substring(i, i
						+ findMeLength));
				break;
			}
		}
		if (!foundIt)
			System.out.println("No match found.");
	}
}