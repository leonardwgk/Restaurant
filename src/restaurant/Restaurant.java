package restaurant;

import people.Chef;
import people.Visitor;
import helper.Helper;

import java.util.*;

public class Restaurant {
	private String name;
	private HashSet<Chef> chefs;
	private HashSet<Menu> menus;
	private int totalIncome;
	
	public Restaurant(String name) {
		this.name = name;
		chefs = new HashSet<Chef>();
		menus = new HashSet<Menu>();
		
		System.out.printf("%s restaurant has opened!\n", name);
		System.out.println("===================================");
	}
	
	public String getName() {
		return name;
	}

	public void addChef(Chef chef) {
		chefs.add(chef);
		
		System.out.printf("%s become chef at %s's restaurant\n", chef.getName(), name);
	}

	public void addMenu(Menu menu) {
		menus.add(menu);
	}

	public void showMenu() {
		System.out.printf("===%s's Menu===\n", name);
		for(Menu menu : menus) {
			System.out.printf("%s\n", menu.getType());
			for(String food : menu.getMenus().keySet()) {			
				System.out.printf("\t- %s\n", menu.getMenus().get(food).getName());
			}
		}
		System.out.println("===Hope you like it!===");
	}

	public void showChef() {
		System.out.println("======Our Chefs=======");
		for(Chef chef : chefs) {
			System.out.printf("\t- %s\n", chef.getName());
		}
		System.out.println("======================");
	}

	public void order(Chef chef, Visitor visitor, String menu, int qty) {
		int price = 0;
		for(Menu orderMenu : menus) {
			if(orderMenu.getMenus().get(menu) != null) {
				price = orderMenu.getMenus().get(menu).getPrice();
			}
		}
		
		totalIncome += qty * price;
		chef.addCookHistory(menu, qty, menus);
		visitor.setTotal(price);
		
		System.out.printf("Chef %s preparing your meal!\n", chef.getName());
	}

	public void showTotalIncome() {
		System.out.println("======================");
		System.out.printf("Total income: %s\n", Helper.formatIDR(totalIncome));
		System.out.println("======================");
	}

}
