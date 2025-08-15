package iut.bad;

public class Femme extends Humain {
	
	public Femme() {
		super();
		
	}
	
	public Femme(String nom,String prenom,int age) {
		super(nom,prenom,age);
	}
	
	@Override
	public String toString() {
		return "Madame " + nom + " , " + prenom + " et " + age;
	}
	
	public static void main(String[] args) {
        Homme h = new Homme("Adrien Franto", "RAZAFINDRATOVO", 22);
        Femme f = new Femme("RALANTOSOA", "Aliance", 21);
        
        
        h.ami(f);
        f.ami(h,777);
    }

}
