package part5;

public class Sample1 {

	public static void main(String[] args) {

		Reg.test("ap\\s+ple", "ap ple", "ap##ple");
		Reg.test("ap\\S+ple", "ap ple", "ap##ple");
	}
}
