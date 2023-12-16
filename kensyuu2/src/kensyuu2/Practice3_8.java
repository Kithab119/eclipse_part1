package kensyuu2;

public class Practice3_8 {

	public static void main(String[] args) {

		//練習３−１
		int weight = 60;
		if (weight == 60);
		
		int age1 = 3;
		int age2 = 4;
		if ((age1 + age2)*2 > 60);
		
		int age = 5;
		if (age % 2 != 0);
		
		String name = "田中";
		if (name.equals("湊"));
		
		//練習３−２
		//c, d, e
		
		//練習３−３
		int isHungry = 1;
		String food = "gohann";
		
		System.out.println("こんにちは");
		if (isHungry == 0) {
			System.out.println("お腹がいっぱいです");
		} else {
			System.out.println("はらぺこです");
		}
		if (isHungry == 1) {
			System.out.println(food + "をいただきます");
		}
		System.out.println("ごちそうさまでした");
		
		//練習３−４
		//{}でelseの中身を括る
		
		//練習３−５
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
		
		//練習３−６
		System.out.println("数あてゲーム");
		
		int ans = new java.util.Random().nextInt(9);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("０〜９の数字を入力してください");
			int num = new java.util.Scanner(System.in).nextInt();
			if (num == ans) {
				System.out.println("アタリ！");
			} else {
				System.out.println("違います");
			}
		}
		
		System.out.println("ゲームを終了します");
	}

}
