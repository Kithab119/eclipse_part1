package kensyuu3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class kitasoft5_5 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(
                new InputStreamReader( System.in ) );
        int value = Integer.parseInt( br.readLine() );

        int binary[] = new int[16];
        
        //配列 binaryに0か1を代入する

        for (int j = 15; j >= 0; j--) {
        	binary[j] = value % 2;
        	value = value / 2;
        }
        
        for( int i = 0 ; i < 16 ; i++ ) {
          System.out.print( binary[i] );
	    }
	}
}
