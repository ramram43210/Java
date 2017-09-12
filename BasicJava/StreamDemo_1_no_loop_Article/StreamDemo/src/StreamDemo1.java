import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * In Java 8 No more loops:
 * 
 * Find the first article in the collection that has the tagName “Java”.
 */
public class StreamDemo1
{
	public static void main(String[] args)
	{
		List<Article> articleList = getArticleList();
		
		
		Article article = getFirstArticleUsingForLoop(articleList);
		System.out.println(article);
		
		System.out.println("------------------------------------------------------------------");
		
		article = getFirstArticleUsingStream(articleList);
		System.out.println(article);
	}

	private static Article getFirstArticleUsingForLoop(List<Article> articleList)
	{
		/*
		 * Before JDK8 - Using a for-loop
		 */
		for (Article article : articleList)
		{
			if (article.getTagName().contains("Java"))
			{
				return article;
			}
		}
		return null;
	}

	private static Article getFirstArticleUsingStream(List<Article> articleList)
	{
		/*
		 * With JDK 8 - Using operations from the stream API
		 */
		Optional<Article> optional = articleList.stream()
				.filter(article -> article.getTagName().contains("Java"))
				.findFirst();

		Article article = optional.get();
		return article;
	}
	

	private static List<Article> getArticleList()
	{
		List<Article>  listOfArticle = new ArrayList<Article>();
		
		listOfArticle.add(new Article("Java complete Reference","John","Java"));
		listOfArticle.add(new Article("Java Programming","John","Java"));
		listOfArticle.add(new Article("RESTful web services","John","Web Service"));		
		listOfArticle.add(new Article("Programming Ruby","John","Ruby"));
		
		return listOfArticle;		
	}
}