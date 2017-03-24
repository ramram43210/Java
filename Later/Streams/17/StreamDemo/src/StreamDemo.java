import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Print out the sum of ages of all male authors younger than 50.
 * 
 */
public class StreamDemo
{
	public static void main(String[] args)
	{
		List<Book> bookList = new ArrayList<Book>();

		// Adding Books
		bookList.add(new Book("Java Basics",
				new Author("Peter", "peter@yahoo.com", 20,'M'), 1000.50));

		bookList.add(new Book("Mysql Basics",
				new Author("Steve", "steve@yahoo.com", 30,'M'), 2000.0));

		bookList.add(new Book("Oracle Basics",
				new Author("John", "john@yahoo.com", 40,'M'), 3000.0));

		bookList.add(new Book("Angular Basics",
				new Author("Juli", "juli@yahoo.com", 55,'F'), 3000.0));
		
		bookList.add(new Book("Jquery Basics",
				new Author("Dave", "dave@yahoo.com", 65,'M'), 1000.0));



		Integer sumOfMaleAge = bookList.stream()
				.map(Book::getAuthor)
		          .filter(author -> author.getGender() =='M')
		          .map(Author::getAge)
		          .filter(age -> age <50)
		          .reduce(0, Integer::sum);

		System.out.println("sumOfMaleAge = "+sumOfMaleAge);

	}
}