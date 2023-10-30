package part2;

import java.util.List;

public class ToListExample {

	public static void main(String[] args) {
		
		var list = List.of("banana", "orange", "peach", "apple", "pineapple");
		
		var result = list.stream()
			.filter(e -> e.length()<6)
			.map(e -> e.toUpperCase())
			.toList();
		
		result.forEach(System.out::println);
	}

}
