package org.formation.facade.test;

import org.formation.facade.Book;
import org.formation.facade.Fruit;
import org.formation.facade.ItemElement;
import org.formation.facade.ShoppingCartVisitor;
import org.formation.facade.ShoppingCartVisitorImpl;

public class MainTest {

	public static void main(String[] args) {
		ItemElement[] items = new ItemElement[] { new Book("1234", 20), 
				new Book("5678", 100), 
				new Fruit(10, 2, "Banana"), 
				new Fruit(5, 5, "Apple")};
		int total = calculatePrice(items);
		System.out.println("Total Cost = " + total);
		}

	private static int calculatePrice(ItemElement[] items) {
		ShoppingCartVisitor shop = new ShoppingCartVisitorImpl();
		int cost =0;
		for (ItemElement itemElement : items) {
			cost += itemElement.accept(shop);
			}
		return cost;
	}
}


