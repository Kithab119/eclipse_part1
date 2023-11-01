package part2;

import java.util.List;

public class Sample6 {

	public static void main(String[] args) {
		
		var list = List.of(
				new Department("総務", List.of("田中", "木村")),
				new Department("経理", List.of("佐藤", "山田")),
				new Department("営業", List.of("山本", "藤田", "斉藤")) );
		
		list.stream()
			.mapMulti((e, buf) -> {
				var ls = e.employees();
				ls.forEach(name -> buf.accept(name));
			})
			.forEach(name -> System.out.print(name + " "));
	}

}
