package part5;

public class Sample1 {

	public static void main(String[] args) {

		Reg.test("\\w+", "apple_12", "#$%&");
		Reg.test("\\W+", "apple_12", "#$%&");
	}
}
