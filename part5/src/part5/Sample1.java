package part5;

public class Sample1 {

	public static void main(String[] args) {

		String reg = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20}$";
		String s = "パスワード";
		System.out.println(s.matches(reg));
	}
}
