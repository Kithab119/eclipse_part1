package kensyu1day;

public class Part3_5 {

	public static void main(String[] args) {

		System.out.print("[メニュー]１：検索 ２：登録 ３：削除 ４：変更＞");
		
		int selected = new java.util.Scanner(System.in).nextInt();
		switch (selected) {
			case 1 -> {
				System.out.println("検索します");
			}
			case 2 -> {
				System.out.println("登録します");
			}
			case 3 -> {
				System.out.println("削除します");
			}
			case 4 -> {
				System.out.println("変更します");
			}
		}
	}

}
