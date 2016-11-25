package org.formation.observer;

public class ConcreteObserver2 implements Observer {

	@Override
	public void update(int v) {
	System.out.println("Observer received new value");		
	System.out.println("*****"+v+"*****");
	}

}
