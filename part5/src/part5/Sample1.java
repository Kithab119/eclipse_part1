package part5;

public class Sample1 {

	public static void main(String[] args) {

		Reg.test("\\d+", "2301", "apple_#");
		Reg.test("\\D+", "2301", "apple_#");
	}
}
