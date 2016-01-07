public class Book implements Cloneable
{
	private String name;
	private String isbnNumber;

	public Book(String name, String isbnNumber)
	{
		super();
		this.name = name;
		this.isbnNumber = isbnNumber;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getIsbnNumber()
	{
		return isbnNumber;
	}

	public void setIsbnNumber(String isbnNumber)
	{
		this.isbnNumber = isbnNumber;
	}

	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}

}
