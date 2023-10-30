package part2;

import java.util.List;
import java.util.Arrays;

public class StreamExample {

	public static void main(String[] args) {
		
		var list = List.of("banana", "orange", "peach", "apple", "pineapple");
		
		list.stream()
			.filter(e -> e.length()<6)
			.map(e -> e.toUpperCase())
			.forEach(System.out::println);
	}

}
