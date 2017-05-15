import java.util.HashSet;
import java.util.Set;

public class Student
{
	private String name;
	private Set<String> bookSet;

	public void addBook(String bookName)
	{
		if (this.bookSet == null)
		{
			this.bookSet = new HashSet<>();
		}
		this.bookSet.add(bookName);
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Set<String> getBookSet()
	{
		return bookSet;
	}

	public void setBookSet(Set<String> bookSet)
	{
		this.bookSet = bookSet;
	}

}
