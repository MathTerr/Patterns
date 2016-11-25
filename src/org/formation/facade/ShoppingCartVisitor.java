package org.formation.facade;

public interface ShoppingCartVisitor {
	int visit(Book book);
	int visit(Fruit fruit);
	
}
