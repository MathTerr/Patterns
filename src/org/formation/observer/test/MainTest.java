package org.formation.observer.test;

import org.formation.observer.ConcreteObserver;
import org.formation.observer.ConcreteObserver2;
import org.formation.observer.ConcreteSubject;
import org.formation.observer.DataStore;
import org.formation.observer.Observer;
import org.formation.observer.Screen;

public class MainTest {

	public static void main(String[] args) {
		testOberserver();
		testObserverJava();
	}

	private static void testObserverJava() {
		DataStore ds = new DataStore();
		Screen sc1 = new Screen();
		Screen sc2 = new Screen();
		Screen sc3 = new Screen();
		
		ds.addObserver(sc3);
		ds.addObserver(sc2);
		ds.addObserver(sc1);
		int nb = ds.countObservers();
		System.out.println("Ce dataStore a "+nb +" screen abonnés");
		ds.setData("yolo");
		ds.deleteObserver(sc3);
		int nb2 = ds.countObservers();
		System.out.println("Ce dataStore a "+nb2 +" screen abonnés");
		ds.setData("coucou");
		
		
	}

	private static void testOberserver() {

		ConcreteSubject subject = new ConcreteSubject();
		Observer o1 = new ConcreteObserver();
		Observer o2 = new ConcreteObserver();
		Observer o3 = new ConcreteObserver();
		Observer vue = new ConcreteObserver2();

		subject.register(o1);
		subject.register(o2);
		subject.register(o3);
		subject.register(vue);

		subject.setValue(42);
		subject.unRegister(o2);
		System.out.println("later on");
		subject.setValue(50);

	}

}
