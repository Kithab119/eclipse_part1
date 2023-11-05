package part2;

import java.util.OptionalDouble;
import java.util.OptionalInt;

public class Sample11 {

	public static void main(String[] args) {
		
		var list = Book.getBookList();
		
		int total = list.stream()
				.mapToInt(Book::price)
				.sum();
		
		OptionalDouble ave = list.stream()
				.mapToInt(Book::price)
				.average();
		
		OptionalInt max = list.stream()
				.mapToInt(Book::price)
				.max();
		
		System.out.println("合計金額 = " + total);
		System.out.println("合計金額 = " + ave.orElse(0));
		System.out.println("合計金額 = " + max.orElse(0));
	}

}
