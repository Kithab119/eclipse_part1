package kensyuu3;

public class kitasoft3 {

	public static void main(String[] args) {

		//5-3
		int[] number = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.out.print("奇数:");
		for (int i = 0; i < number.length; i++) {
			if (number[i] % 2 != 0) {
				System.out.print(" " + number[i]);
			}
		}
		
		System.out.println();
		
		System.out.print("偶数:");
		for (int i = 0; i < number.length; i++) {
			if (number[i] % 2 == 0) {
				System.out.print(" " + number[i]);
			}
		}
		
		System.out.println();
		
		//5-4
		int[] hund = new int[10];
		int sum = 0;
		int k = 0;
		for (int j = 0; j < 10; j++) {
			int input = new java.util.Scanner(System.in).nextInt();
			hund[j] = input;
			sum += hund[j];
			if (sum > 100) {
				k = j;
				break;
			}
		}
		
		for (int i = 0; i <= k; i++) {
			System.out.print(":" + hund[i] + " ");
		}
	}
}
