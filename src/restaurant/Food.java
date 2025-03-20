package restaurant;

public class Food {
	private String name;
	private int price;
	private int qty;
	
	public Food(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
}
