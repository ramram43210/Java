public class SearchContext
{

		private SearchStrategy searchStrategy;

		public void setSearchStrategy( SearchStrategy searchStrategy )
		{
				this.searchStrategy = searchStrategy;
		}

		public int search( int[] list, int item )
		{
				return searchStrategy.search(list, item);
		}
}