package kensyuu3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class kitasoft5_8 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(
                new InputStreamReader( System.in ) );
		int values[] = new int[10];

		for( int i = 0 ; i < 10 ; i++ )
			values[i] = Integer.parseInt( br.readLine() );

		//肝
		for( int i = 0 ; i < 10 ; i++ )
		{
			for( int j = i + 1 ; j < 10 ; j++ )
			{
				if( values[i] > values[j] ){
					int t = values[i];
					values[i] = values[j];
					values[j] = t;
				}
			}
		}

		for( int i = 0 ; i < 10 ; i++ )
			System.out.print( values[i] + " " );
		}

}
