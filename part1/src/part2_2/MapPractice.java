package part2_2;

import java.util.HashMap;

public class MapPractice {

	public static void main(String[] args) {
		
		var map = new HashMap<String, String>();
		User user1 = new User("ab123", "田中宏");
		User user2 = new User("ab224", "佐藤修");
		User user3 = new User("ac331", "木村正一");
		
		map.put(user1.id(), user1.name());
		map.put(user2.id(), user2.name());
		map.put(user3.id(), user3.name());
		
		System.out.println(map.get("ab224"));
	}

}
