public class ObjectClassTest
{

	public static void main(String[] args)
	{
		Book childrenStoryBookObj = new Book("Children Story", "2000");
		Book KidStoryBookObj = new Book("Kids Story", "2000");

		System.out.println("childrenStoryBookObj.hashCode() = "
				+ childrenStoryBookObj.hashCode());

		System.out.println("KidStoryBookObj.hashCode()      = "
				+ KidStoryBookObj.hashCode());

		/*
		 * The equals() method provided in the Object class
		 * uses the identity operator (==) to determine
		 * whether two objects are equal.
		 * 
		 * For objects, The equals() method provided by
		 * Object tests whether the object references are
		 * equal—that is, if the objects compared are the
		 * exact same object.
		 */

		System.out
				.println("childrenStoryBookObj.equals(KidStoryBookObj)      = "
						+ childrenStoryBookObj
								.equals(KidStoryBookObj));

		System.out
				.println("childrenStoryBookObj.equals(childrenStoryBookObj) = "
						+ childrenStoryBookObj
								.equals(childrenStoryBookObj));

	}

}
