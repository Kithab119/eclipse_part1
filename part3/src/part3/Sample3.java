package part3;

import jp.kwebs.lib.Input;

public class Sample3 {

	public static void main(String[] args) {

		String str = Input.getString();
		
		try {
			analyse(str);
			System.out.println("OK: " + str);
		}
		
		catch(IllegalCharException e) {
			System.err.println(e);
		}
		
		public static void analyse(String str) {
			if(str.contains("@")) {
				throw new illegalCharException("@は使えません")
			}
		}
	}

}
