public class Book
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
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((isbnNumber == null) ? 0 : isbnNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (isbnNumber == null)
		{
			if (other.isbnNumber != null)
				return false;
		}
		else if (!isbnNumber.equals(other.isbnNumber))
			return false;
		return true;
	}
}
