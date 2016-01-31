public class ObjectClassTest
{

	public static void main(String[] args)
	{
		Book childrenStoryBook = new Book("Children Story",
				"2000");
		Book KidStoryBook = new Book("Kids Story", "2000");
		
		System.out.println("childrenStoryBook.hashCode = "+childrenStoryBook.hashCode());
		System.out.println("KidStoryBook.hashCode = "+KidStoryBook.hashCode());

		/*
		 * This program displays objects are equal even
		 * though childrenStoryBook and KidStoryBook
		 * reference two distinct objects. They are
		 * considered equal because the objects compared
		 * contain the same ISBN number.
		 */
		if (childrenStoryBook.equals(KidStoryBook))
		{
			System.out.println("objects are equal");
		}
		else
		{
			System.out.println("objects are not equal");
		}

	}

}
