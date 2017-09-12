import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Get all articles in the collection that has the tagName “Java”.
 */
public class StreamDemo2
{
	public static void main(String[] args)
	{
		List<Article> articleList = getArticleList();
		List<Article> javaArticleList = getAllArticleUsingForLoop(articleList);		
		System.out.println(javaArticleList);
		
		System.out.println("------------------------------------------------------------------");
		
		/*
		 * With JDK 8 - Using operations from the stream API
		 */
		javaArticleList = getAllArticleUsingStream(articleList);	
		System.out.println(javaArticleList);
	}
	
	
	private static List<Article> getAllArticleUsingForLoop(List<Article> articleList)
	{
		/*
		 * Before JDK8 - Using a for-loop
		 */
		List<Article> javaArticleList = new ArrayList<Article>(); 
		for (Article article : articleList)
		{
			if (article.getTagName().contains("Java"))
			{
				javaArticleList.add(article);
			}
		}
		return javaArticleList;
	}

	private static List<Article> getAllArticleUsingStream(List<Article> articleList)
	{
		/*
		 * With JDK 8 - Using operations from the stream API
		 */
		List<Article> javaArticleList = articleList.stream()
				.filter(article -> article.getTagName().contains("Java"))
				.collect(Collectors.toList());		
		
		return javaArticleList;

	}
	

	private static List<Article> getArticleList()
	{
		List<Article>  listOfArticle = new ArrayList<Article>();
		
		listOfArticle.add(new Article("Java complete Reference","John","Java"));
		listOfArticle.add( new Article("Java Programming","John","Java"));
		listOfArticle.add(new Article("RESTful web services","John","Web Service"));		
		listOfArticle.add(new Article("Programming Ruby","John","Ruby"));
		
		return listOfArticle;		
	}

}