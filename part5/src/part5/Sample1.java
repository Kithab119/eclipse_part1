package part5;

public class Sample1 {

	public static void main(String[] args) {

		Reg.test("(?i)(tim|tom|sam)", "Tim", "Kim", "Tom", "Sam");
		Reg.test("(?-i)(tim|tom|sam)", "Tim", "Kim", "Tom", "Sam");
	}
}
