package part2;

import java.util.stream.Collectors;

public class Sample13 {

	public static void main(String[] args) {

		var list = Book.getBookList();
		var book_author = list.stream()
				.collect(Collectors.groupingBy(
						Book::author,
						Collectors.mapping(Book::title, Collectors.toList())
						));
		
		book_author.forEach((k, v) -> {
			System.out.println(k);
			String titles = v.stream().collect(Collectors.joining(","));
			System.out.println(" " + titles);
		});
	}

}
