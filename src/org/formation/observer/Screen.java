package org.formation.observer;

import java.util.Observable;
import java.util.Observer;

public class Screen implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if (o instanceof DataStore) {
			System.out.println("i'm notified ! New value : " + ((DataStore) o).getData());
		}
	}
}