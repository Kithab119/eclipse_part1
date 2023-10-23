package part1_3;

public class Taxkeisan {

	public static void main(String[] args) {
		
		Tax tax = new Tax(100, "田中宏", 150);
		int zei = tax.zeigaku(new Rate1());
		System.out.println(tax.getName() + "\t" + zei);
	}

}
