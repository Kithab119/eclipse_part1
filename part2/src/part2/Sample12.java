package part2;

import java.util.stream.Collectors;

public class Sample12 {

	public static void main(String[] args) {

		var list = Book.getBookList();
		
		String titles = list.stream()
				.map(Book::title)
				.collect(Collectors.joining(","));
		
		System.out.println(titles);
	}

}
