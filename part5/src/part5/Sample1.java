package part5;

public class Sample1 {

	public static void main(String[] args) {

		Reg.test("(?=.*tom).{6,10}", "xtom130", "tom", "tom.13$");
		Reg.test("(?=.*tom)\\w+", "xtom130", "tom", "tom.13$");
	}
}
