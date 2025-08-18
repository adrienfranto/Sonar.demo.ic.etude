package iut.bad;

public class Femme extends Humain {
    public Femme(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }

    @Override
    public String toString() {
        return String.format("Madame %s , %s et %d", nom, prenom, age);
    }

    public static void main(String[] args) {
        Homme h = new Homme("Adrien", "Franto", 22);
        Femme f = new Femme("Alliance", "RALANTOSOA", 21);

        h.ami(f);
        f.ami(h, 7000);
    }
}

