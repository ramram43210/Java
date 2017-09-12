import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Get DistinctTagNames in the collection.
 */
public class StreamDemo2
{
	public static void main(String[] args)
	{
		List<Article> articleList = getArticleList();
		Set<String> distinctTagNamesSet = getDistinctTagNamesUsingForLoop(articleList);		
		System.out.println(distinctTagNamesSet);
		
		System.out.println("------------------------------------------------------------------");
		
		distinctTagNamesSet = getDistinctTagNamesUsingStream(articleList);		
		System.out.println(distinctTagNamesSet);
	}
	
	
	private static Set<String> getDistinctTagNamesUsingForLoop(List<Article> articleList)
	{
		/*
		 * Before JDK8 - Using a for-loop
		 */
		Set<String> distinctTagNamesSet = new HashSet<>();

		for (Article article : articleList)
		{
			distinctTagNamesSet.add(article.getTagName());
		}

		return distinctTagNamesSet;
	}

	private static Set<String> getDistinctTagNamesUsingStream(List<Article> articleList)
	{
		/*
		 * With JDK 8 - Using operations from the stream API
		 */
		Set<String> distinctTagNamesSet = articleList.stream()
				.map(article -> article.getTagName()).distinct()
				.collect(Collectors.toSet());

		return distinctTagNamesSet;

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