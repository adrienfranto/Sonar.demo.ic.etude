package iut.bad;

public class Humain {
	protected String nom;
	protected String prenom;
	protected int age;
	
	public Humain() {
		super();
	}
	
	public Humain(String nom,String prenom,int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	public void details() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return nom + " , " + prenom + " et " + age;
	}
	
	
	public void manger() {
	    System.out.println(nom + " " + prenom + " prend le temps de manger.");
	}

	public void boire() {
	    System.out.println(nom + " " + prenom + " s'accorde un moment pour boire.");
	}
	

}