package restaurant;

import java.util.*;

public class Menu {
	private String type;
	private HashMap<String, Food> menus;
	
	public Menu(String type) {
		this.type = type;
		menus = new HashMap<String, Food>();
	}
	
	public String getType() {
		return type;
	}

	public void add(Food food) {
		menus.put(food.getName(), food);
		
		System.out.printf("menu %s (%s) added!\n", food.getName(), type);
	}
	
	public HashMap<String, Food> getMenus(){
		return menus;
	}

}
