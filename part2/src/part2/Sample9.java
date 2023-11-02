package part2;

import java.util.stream.Collectors;

public class Sample9 {

	public static void main(String[] args) {
		
		var list = Book.getBookList();
		var myMap = list.stream()
				.limit(3)
				.collect(Collectors.toMap(Book::title, Book::price));
		
		myMap.forEach((k, v) -> System.out.println(k + " " + v));
	}

}
