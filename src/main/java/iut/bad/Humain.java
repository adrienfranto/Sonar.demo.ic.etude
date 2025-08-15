package iut.bad;

import java.util.logging.Logger;

public class Humain implements Consommation {
    private static final Logger LOGGER = Logger.getLogger(Humain.class.getName());

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
        LOGGER.info(toString());
    }

    @Override
    public String toString() {
        return nom + " , " + prenom + " et " + age;
    }

    @Override
    public void manger() {
        LOGGER.info(nom + " " + prenom + " prend le temps de manger.");
    }

    @Override
    public void boire() {
        LOGGER.info(nom + " " + prenom + " s'accorde un moment pour boire.");
    }

    public void ami(Humain h) {
        ami(h, 100);
    }

    public void ami(Humain h, int duree) {
        LOGGER.info(this.nom + " " + this.prenom +
                    " est maintenant ami avec " + h.nom + " " + h.prenom +
                    " pour " + duree + " jours.");
    }
}
