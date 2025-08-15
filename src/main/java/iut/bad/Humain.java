package iut.bad;

public class Humain implements Consommation {
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
	
	
	@Override
	public void manger() {
	    System.out.println(nom + " " + prenom + " prend le temps de manger.");
	}

	@Override
	public void boire() {
	    System.out.println(nom + " " + prenom + " s'accorde un moment pour boire.");
	}
	
	public void ami(Humain autre) {
        System.out.println(this.nom + " " + this.prenom + " est maintenant ami avec " 
                           + autre.nom + " " + autre.prenom + ".");
    }

}