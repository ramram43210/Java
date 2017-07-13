import java.util.ArrayList;
import java.util.List;

/**
 *
 * How to get the sum of ages of all male authors younger than 50.
 *
 */
public class StreamDemo
{
	public static void main(String[] args)
	{
		List<Book> bookList = new ArrayList<Book>();

		// Adding Books
		bookList.add(new Book("Java Basics",
				new Author("Peter", "peter@yahoo.com", 20, 'M'),1000.50));

		bookList.add(new Book("Mysql Basics",
				new Author("Steve", "steve@yahoo.com", 30, 'M'),2000.0));

		bookList.add(new Book("Oracle Basics",
				new Author("John", "john@yahoo.com", 40, 'M'),3000.0));

		bookList.add(new Book("Angular Basics",
				new Author("Juli", "juli@yahoo.com", 55, 'F'),3000.0));

		bookList.add(new Book("Jquery Basics",
				new Author("Dave", "dave@yahoo.com", 65, 'M'),1000.0));

		/*
		 * Using the same original stream we once again map the
		 * elements from Books to Authors and filter just on those
		 * authors that are male. Next we map the elements from
		 * Authors to author ages which gives us a stream of ints. We
		 * filter ages to just those that are less than 50 and use a
		 * reduce operation and Integer::sum to total the ages.
		 */

		Integer sumOfMaleAuthorAge = 
				 bookList.stream()//Stream<Book>
				.map(Book::getAuthor) //Stream<Book> to Stream<Author>.
				.filter(author -> author.getGender() == 'M') // filter the male Authors.
				.map(Author::getAge)//Stream<Author> to Stream<age>.
				.filter(age -> age < 50)//filter the age<50.
				.reduce(0, Integer::sum);// calculate the sum of ages.

		System.out.println("sumOfMaleAuthorAge = " + sumOfMaleAuthorAge);

	}
}