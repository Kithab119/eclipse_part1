package part3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Sample1 {

	public static void main(String[] args) {

		try {
			Path p = Path.of("_fruit.txt");
			var list = Files.readAllLines(p);
			list.forEach(System.out::println);
		}
		
		catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}
	}

}
