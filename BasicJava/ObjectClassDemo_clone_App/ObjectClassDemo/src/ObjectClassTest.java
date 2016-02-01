public class ObjectClassTest
{

	public static void main(String[] args)
			throws CloneNotSupportedException
	{
		Book childrenStoryBookObj = new Book("Children Story", "2000");
		System.out.println("Original book Object ...");
		System.out.println("Name        = "
				+ childrenStoryBookObj.getName());
		
		System.out.println("ISBN Number = "
				+ childrenStoryBookObj.getIsbnNumber());

		Book clonedChildrenStoryBookObj = (Book) childrenStoryBookObj
				.clone();

		System.out.println("----------------------------");
		System.out.println("Cloned book Object ...");
		System.out.println("Name        = "
				+ clonedChildrenStoryBookObj.getName());
		System.out.println("ISBN Number = "
				+ clonedChildrenStoryBookObj.getIsbnNumber());

	}

}
