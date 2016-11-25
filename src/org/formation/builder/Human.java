package org.formation.builder;

public class Human {

	private String couleurYeux, couleurPeau, couleurCheveux;
	private boolean isMan;
	private String cerveauHumain;
	private String coeurHumain;

	public String getCerveauHumain() {
		return cerveauHumain;
	}

	public String getCoeurHumain() {
		return coeurHumain;
	}

	public String getCouleurYeux() {
		return couleurYeux;
	}

	public String getCouleurPeau() {
		return couleurPeau;
	}

	public String getCouleurCheveux() {
		return couleurCheveux;
	}

	public boolean isMan() {
		return isMan;
	}

	private Human(HumanBuilder humanBuilder){
		this.cerveauHumain = humanBuilder.cerveauHumain;
		this.coeurHumain = humanBuilder.coeurHumain;
		this.couleurCheveux = humanBuilder.couleurCheveux;
		this.couleurPeau = humanBuilder.couleurPeau;
		this.couleurYeux = humanBuilder.couleurYeux;
	}

	public static class HumanBuilder {
		private String couleurYeux, couleurPeau, couleurCheveux;
		private boolean isMan;
		private String cerveauHumain;
		private String coeurHumain;

		public HumanBuilder(String cerveau, String coeur) {
			this.cerveauHumain = cerveau;
			this.coeurHumain = coeur;
		}

		public HumanBuilder setCouleurYeux(String couleurYeux) {
			this.couleurYeux = couleurYeux;
			return this;
			
		}

		public HumanBuilder setCouleurPeau(String couleurPeau) {
			this.couleurPeau = couleurPeau;
			return this;
		}

		public HumanBuilder setCouleurCheveux(String couleurCheveux) {
			this.couleurCheveux = couleurCheveux;
			return this;
		}

		public HumanBuilder setMan(boolean isMan) {
			this.isMan = isMan;
			return this;
		}
		
		public Human build(){
			return new Human(this);
		}


		
	}

	@Override
	public String toString() {
		return "HumanBuilder [couleurYeux=" + couleurYeux + ", couleurPeau=" + couleurPeau + ", couleurCheveux="
				+ couleurCheveux + ", isMan=" + isMan + ", cerveauHumain=" + cerveauHumain + ", coeurHumain="
				+ coeurHumain + "]";
	}

}
