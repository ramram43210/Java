import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Group all the articles based on the author.
 */
public class StreamDemo1
{
	public static void main(String[] args)
	{
		List<Article> articleList = getArticleList();

		Map<String, List<Article>> groupByAuthorMap = groupByAuthorUsingForLoop(
				articleList);

		for (String key : groupByAuthorMap.keySet())
		{
			System.out.println(key + " = " + groupByAuthorMap.get(key));
		}

		System.out.println("-----------------------------");

		groupByAuthorMap = groupByAuthorUsingStream(articleList);
		for (String key : groupByAuthorMap.keySet())
		{
			System.out.println(key + " = " + groupByAuthorMap.get(key));
		}
	}

	private static Map<String, List<Article>> groupByAuthorUsingForLoop(
			List<Article> articleList)
	{
		/*
		 * Before JDK8 - Using a for-loop
		 */
		Map<String, List<Article>> groupByAuthorMap = new HashMap<>();

		for (Article article : articleList)
		{
			if (groupByAuthorMap.containsKey(article.getAuthor()))
			{
				groupByAuthorMap.get(article.getAuthor()).add(article);
			}
			else
			{
				ArrayList<Article> articles = new ArrayList<>();
				articles.add(article);
				groupByAuthorMap.put(article.getAuthor(), articles);
			}
		}

		return groupByAuthorMap;
	}

	private static Map<String, List<Article>> groupByAuthorUsingStream(
			List<Article> articleList)
	{
		/*
		 * With JDK 8 - Using operations from the stream API
		 */
		Map<String, List<Article>> groupByAuthorMap = articleList
				.stream()
				.collect(Collectors.groupingBy(Article::getAuthor));
		return groupByAuthorMap;
	}
	

	private static List<Article> getArticleList()
	{
		List<Article>  listOfArticle = new ArrayList<Article>();
		
		listOfArticle.add(new Article("Java complete Reference","John","Java"));
		listOfArticle.add( new Article("Java Programming","John","Java"));
		listOfArticle.add(new Article("RESTful web services","Peter","Web Service"));		
		listOfArticle.add(new Article("Programming Ruby","Peter","Ruby"));
		
		return listOfArticle;		
	}
}