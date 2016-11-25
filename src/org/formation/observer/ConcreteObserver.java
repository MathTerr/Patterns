package org.formation.observer;

public class ConcreteObserver implements Observer{
private int id;
	
	@Override
	public void update(int v) {
		System.out.println("Observer "+ id +" received new value " +v);
		
	}

	
	
}
