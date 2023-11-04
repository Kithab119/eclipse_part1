package part2;

import java.util.Comparator;
import java.util.Optional;

public class Sample10 {

	public static void main(String[] args) {

		var list = Book.getBookList();
		
		Optional<Book> book = list.stream()
				.max(Comparator.comparing(Book::price));
		
		System.out.println(book.orElseGet(Book::new));
	}

}
