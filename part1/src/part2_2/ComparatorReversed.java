package part2_2;

import java.util.Arrays;
import java.util.Comparator;
import part2.Apple;

public class ComparatorReversed {
	
	public static void main(String[] args) {
		var list = Arrays.asList(
				new Apple(320, "red"),
				new Apple(280, "green"),
				new Apple(350, "green"),
				new Apple(330, "red"),
				new Apple(250, "red")
				);
		list.sort(Comparator.comparing(Apple::weight).reversed());
		list.forEach(System.out::println);
	}

}
