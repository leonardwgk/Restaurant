package people;

import java.util.*;

import restaurant.Food;
import restaurant.Menu;

public class Chef {
	private String name;
	private ArrayList<Food> cookHistory;
	
	public Chef(String name) {
		this.name = name;
		cookHistory = new ArrayList<Food>();
	}

	public String getName() {
		return name;
	}
	
	public void addCookHistory(String name, int qty, HashSet<Menu> menus) {
		Food food = null;
		for(Menu menu : menus) {
			if(menu.getMenus().get(name) != null) {
				food = menu.getMenus().get(name);
			}
		}
		
		cookHistory.add(food);
	}

	public void showCookHistory() {
		System.out.println("======================");
		System.out.printf("%s cook history:\n", name);
		for(Food food : cookHistory) {
			System.out.printf("\t- %s\n", food.getName());
		}
	}
}
