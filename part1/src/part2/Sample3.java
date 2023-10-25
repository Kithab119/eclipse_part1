package part2;

import java.util.List;
import java.util.function.Predicate;

public class Sample3 {
	
	public static void main(String[] args) {
		testApple( a -> a.color().equals("red") && a.weight()>=320 );
	}
	
	public static void testApple(Predicate<Apple> p) {
		var list = getAppleList();
		
		for(Apple apple : list) {
			if(p.test(apple)) {
				System.out.println(apple);
			}
		}
	}
	
	public static List<Apple> getAppleList() {
		var list = List.of(
				new Apple(320, "red"),
				new Apple(280, "green"),
				new Apple(350, "green"),
				new Apple(330, "red"),
				new Apple(250, "red")
				);
		return list;
	}

}
