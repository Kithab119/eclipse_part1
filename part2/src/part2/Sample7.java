package part2;

import java.util.List;

public class Sample7 {

	public static void main(String[] args) {
		
		var list = List.of("apple", "peach", "watermelon");
		
		list.stream()
			.peek(e -> System.out.print(e + " "))
			.map(String::toUpperCase)
			.forEach(e -> System.out.print(e));
	}

}
