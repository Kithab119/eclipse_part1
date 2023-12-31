package part1_2;

import java.time.LocalDate;
import java.util.List;

public class Part1_2 {

	public static void main(String[] args) {
		var list = List.of(
				new Student(10, "田中博", "tanaka@mail.jp", 2, LocalDate.of(2000, 1, 1)),
				new AuditingStudent(20, "木村健", "kimura@mail.jp", 3, 112),
				new Student(12, "森下樹", "morishita@mail.jp", 2, LocalDate.of(2004, 7, 1))
				);
		
		for (Attendable att : list) {
			att.readAttendance();
		}
	}
}
