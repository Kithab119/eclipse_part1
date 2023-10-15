package part1;

import java.time.LocalDate;
import java.util.List;

public class Part1 {
	
	public static void main(String[] args) {
		List<Member> list = List.of( //List<Member>をvarに変えると自動型推論により、List<Member>型と推論される
				new GeneralMember(200, "木村一郎", null),
				new StudentMember(100, "田中宏", LocalDate.of(2026, 3, 31))
		);
	
		int total = 0;
	
		for(Member member : list) { //Memberをvarに変えると自動型推論により、Member型と推論される
			total += member.kai_hi();
		}
	
		System.out.println("合計=" + total);
	}
}
