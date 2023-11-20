package part5;

public class Sample1 {

	public static void main(String[] args) {

		Reg.test("\\d{3}", "123", "1234", "12345", "123456");
		Reg.test("\\d{3,}", "123", "1234", "12345", "123456");
		Reg.test("\\d{3,5}", "123", "1234", "12345", "123456");
	}
}
