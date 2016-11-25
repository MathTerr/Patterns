package org.formation.composite.test;

import org.formation.composite.CompositeNode;
import org.formation.composite.GroupNode1;
import org.formation.composite.LeafNodeButton;

public class MainTest {

	
	public static void main(String[] args) {
	GroupNode1 group = new GroupNode1();
	CompositeNode leaf1 = new LeafNodeButton();
	CompositeNode leaf2 = new LeafNodeButton();
	group.add(leaf1);
	group.add(leaf2);
		group.draw();
		
		
		
		
	}
}
