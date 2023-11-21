package part5;

public class Sample1 {

	public static void main(String[] args) {

		Reg.test("(1[012]|[1-9])(am|pm)", "10am", "8pm", "13pm");
	}
}
