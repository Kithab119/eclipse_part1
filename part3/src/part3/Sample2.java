package part3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Sample2 {

	public static void main(String[] args) {

		try {
			Path p = Path.of("fruit.txt");
			var in = Files.newBufferedReader(p);
			System.out.println(in.readLine());
			in.close();
		}
		
		catch (IOException e) {
			System.err.println(e + "\nファイルを読み出せません");
		}
	}

}
