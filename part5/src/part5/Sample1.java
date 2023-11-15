package part5;

public class Sample1 {

	public static void main(String[] args) {

		Reg.test("[a-z]xx", "Axx", "gxx", "8xx");
		Reg.test("[a-zA-Z]xx", "Axx", "gxx", "8xx");
	}
}
