package kensyuu3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class kitasoft5_7 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(
                new InputStreamReader( System.in ) );
		int kuku[][] = new int[9][9];
		
		//配列 kuku に値を代入する
		for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                kuku[i][j] = (i + 1) * (j + 1);
            }
        }
		
		int p = Integer.parseInt( br.readLine() );
		int q = Integer.parseInt( br.readLine() );

		System.out.println( kuku[p-1][q-1] );
		
//		for( int i = 0 ; i < 9 ; i++ ) {
//			for( int j = 0 ; j < 9 ; j++ ) {
//				System.out.printf( " %2d", kuku[i][j] );
//			}
//			System.out.println();
//		}
	}

}
