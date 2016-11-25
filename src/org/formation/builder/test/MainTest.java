package org.formation.builder.test;

import org.formation.builder.Human;

public class MainTest {

	public static void main(String[] args) {
		Human human = new Human.HumanBuilder("cerveau", "coeur").setCouleurCheveux("brun")
				.setCouleurYeux("vert").setMan(false).setCouleurPeau("jaune").build();
		System.out.println(human);

	}

}
