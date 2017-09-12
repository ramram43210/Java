public class Article
{
	private String title;
	private String author;
	private String tagName;

	public Article(String title, String author, String tagName)
	{
		super();
		this.title = title;
		this.author = author;
		this.tagName = tagName;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getAuthor()
	{
		return author;
	}

	public void setAuthor(String author)
	{
		this.author = author;
	}

	public String getTagName()
	{
		return tagName;
	}

	public void setTagName(String tagName)
	{
		this.tagName = tagName;
	}

	@Override
	public String toString()
	{
		return "Article [title=" + title + ", author=" + author + ", tagName="
				+ tagName + "]";
	}

}
