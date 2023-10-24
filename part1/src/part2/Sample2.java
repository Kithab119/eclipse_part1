package part2;

public class Sample2 {
	
public static void main(String[] args) {
		
		Tax tax = new Tax(100, "田中宏", 150);
		int zei = tax.zeigaku( gaku->gaku>100 ? 0.12 : 0.04 );
		System.out.println(tax.getName() + "\t" + zei);
	}

}
