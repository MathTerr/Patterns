package org.formation.facade;

public class Book implements ItemElement {
	private String isbnNumber;
	private int price;

	public String getIsbnNumber() {
		return isbnNumber;
	}

	public int getPrice() {
		return price;
	}

	public Book(String isbnNumber, int price) {
		super();
		this.isbnNumber = isbnNumber;
		this.price = price;
	}

	@Override
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}

}
