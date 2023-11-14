package part5;

public class Reg {

	public static void test(String reg, String...strs) {
		
		String sb = reg + "   ";
		
		for(String s : strs) {
			boolean match = s.matches(reg);
			sb += (match ? "O " : "X ") + s + "   ";
		}
		
		System.out.println(sb);
	}
}
