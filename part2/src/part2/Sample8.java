package part2;

import java.util.stream.Collectors;

public class Sample8 {

	public static void main(String[] args) {
		
		var list = Book.getBookList();
		var myList = list.stream().collect(Collectors.toList());
		var mySet = list.stream().collect(Collectors.toSet());
		
		//list.stream().forEach(System.out::println);
		//myList.stream().forEach(System.out::println);
		mySet.stream().forEach(System.out::println);
	}

}
