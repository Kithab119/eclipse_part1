package kensyuu2;

public class kitasoft {

	public static void main(String[] args) {

		//練習３−１０
		int x = 2;
		int y = 4;
		//1
		if (x < y && (x % 2 == 0 && y % 2 == 0)) {
			System.out.println("xはyより小さく、かつ、xとyは共に偶数である。");
		}
		
		//2
		if (x == y && (x < 0 && y < 0)) {
			System.out.println("xとyは等しく、かつ、負の数である。");
		}
		
		//3
		if (x < y || x % 2 == 0) {
			System.out.println("xはyより小さい、または、xは偶数である。");
		}
		
		//4
		if ((x <= 10 || 100 <= x) && (10 <= y && y <= 100)) {
			System.out.println("xは10以下または100以上で、かつ、yは10以上かつ100以下である。");
		}
		
		//5
		if (x >= 0 || y >= 0) {
			System.out.println("xもyも負の数である、ではない。");
		}
		
		if (!(x < 0 && y < 0));//31行目と同じ意味
		
		//練習４−４
		int fact = 1;
		int number = 7;// our number to do the necessary calculations in class Factorial
		  for(int i = 1; i <= number; i++){
		      fact = fact * i;
		  }
		System.out.println("Factorial of "+number+" is: "+fact);
		
		//練習４ー９
	    int max = 0; //最大値
	    int min = 0; //最小値
	    int a; //入力値

	    System.out.println("10個の数字の中から最大値と最小値を求めます。");

	    for(int i = 1; i <= 10; i++){
	       System.out.print(i + "つ目の数字:");
	       a = new java.util.Scanner(System.in).nextInt();

	       if (i == 1) { //最小値に入力値を代入
	    	   min = a;
	    	   max = a;
	       } 
	       
	       if (a < min) { //最小値より入力値が小さければ代入
	           min = a;
	       }
	       
	       if (a > max) { //最大値より入力値が大きければ代入
	    	   max = a;
	       }
	    }
	    
	    System.out.println("最大値は" + max + "です。");
	    System.out.println("最小値は" + min + "です。");
	
		//練習４−１５
		int target = 79;
	
	    if (target < 2) {
	      System.out.println(target + "は素数ではありません。");
	      return;
	    }
	    if (target % 2 == 0) { // 偶数は先にリターン
	      System.out.println(target + "は素数ではありません。");
	      return;
	    }
	
	    for (int j = 3; j <= Math.sqrt(target); j+=2) {
	      if (target % j == 0) {
	        System.out.println(target + "は素数ではありません。");
	        return;
	      }
	    }
	
	    System.out.println(target + "は素数です。");
	    
	    //練習５−１
	    int[] h = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	    for (int i = 0; i < h.length; i++) {
	    	System.out.println(h[i] * 2);
	    }
	    
	    //練習５−２
	    for (int i = h.length - 1; i >= 0;  i--) {
	    	System.out.println(h[i]);
	    }
	    
    }

}
