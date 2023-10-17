package part1;

import java.time.LocalDate;

public class part1_2 {

	public static void main(String[] args) {
		//Member member = new GeneralMember(200, "木村一郎", null);
		Member member = new StudentMember(100, "田中宏", LocalDate.of(2026, 3, 31));
		
		if(member instanceof StudentMember stm) {
			System.out.println("期限日=" + stm.getExpDate());
		}
	}
}
