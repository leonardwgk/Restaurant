package people;

import helper.Helper;

public class Visitor {
	private String name;
	private int total;
	
	public Visitor(String name) {
		this.name = name;
		total = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public void setTotal(int price) {
		total += price;
	}

	public void showTotalPrice() {
		System.out.println("======================");
		System.out.printf("%s spends %s in this restaurants!\n", name, Helper.formatIDR(total));
	}

}
