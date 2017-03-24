import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * Get the unique names in uppercase of the first 2 book authors
 * that are 30 years old or older.
 *
 */
public class StreamDemo
{
	public static void main(String[] args)
	{
		List<Book> bookList = new ArrayList<Book>();

		// Adding Books
		bookList.add(new Book("Java Basics",
				new Author("Peter", "peter@yahoo.com", 25), 1000.50));

		bookList.add(new Book("Mysql Basics",
				new Author("Steve", "steve@yahoo.com", 35), 2000.0));

		bookList.add(new Book("Oracle Basics",
				new Author("John", "john@yahoo.com", 45), 3000.0));

		bookList.add(new Book("Angular Basics",
				new Author("Dave", "dave@yahoo.com", 55), 3000.0));

		bookList.add(new Book("Jquery Basics",
				new Author("Dave", "dave@yahoo.com", 55), 1000.0));


		List<String> filteredBookNameList = new ArrayList<String>();

		/*
		 * From this list of books, we first need to map from books to
		 * the book authors which gets us a stream of Authors and then
		 * filter them to just get those authors that are 30 or over.
		 * We’ll map the name of the Author, which returns us a
		 * stream of Strings. We’ll map this to uppercase Strings and
		 * make sure the elements are unique in the stream and grab
		 * the first 2. Finally we return this as a list using toList
		 * from java.util.streams.Collectors.
		 */

		filteredBookNameList = bookList.stream()
				.map(book -> book.getAuthor())
				.filter(author -> author.getAge() >= 30)
				.map(Author::getName).map(String::toUpperCase)
				.distinct().limit(2).collect(Collectors.toList());

		System.out.println(filteredBookNameList);

	}
}