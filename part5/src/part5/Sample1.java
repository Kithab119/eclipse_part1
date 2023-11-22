package part5;

public class Sample1 {

	public static void main(String[] args) {

		Reg.test("(?=.*tom)(?!.*[0-9]).*", "xtom130", "tom", "tom.13$");
	}
}
