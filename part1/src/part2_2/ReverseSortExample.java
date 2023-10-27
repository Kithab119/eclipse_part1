package part2_2;

import java.util.Arrays;
import java.util.Comparator;

public class ReverseSortExample {
	
	public static void main(String[] args) {
		var list = Arrays.asList("berry", "banana", "peach", "apple", "orange");
		list.sort(Comparator.reverseOrder());
		list.forEach(System.out::println);
	}
	
}
