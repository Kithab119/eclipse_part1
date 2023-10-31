package part2;

import java.util.List;

public class Sample2 {

	public static void main(String[] args) {
		
		var list = List.of("apple", "peach", "watermelon", "banana");
		
		list.stream()
			.takeWhile(e -> e.charAt(0)!='w')
			.forEach(e -> System.out.print(e + " "));
	}

}
