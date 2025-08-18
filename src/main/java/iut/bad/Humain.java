package iut.bad;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Humain implements Consommation {
    private static final Logger LOGGER = LoggerFactory.getLogger(Humain.class);

    protected String nom;
    protected String prenom;
    protected int age;

    public Humain() { }

    public Humain(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public void details() {
        LOGGER.info("{}", this);
    }

    @Override
    public String toString() {
        return String.format("%s , %s et %d", nom, prenom, age);
    }

    @Override
    public void manger() {
        LOGGER.info("{} {} prend le temps de manger.", nom, prenom);
    }

    @Override
    public void boire() {
        LOGGER.info("{} {} s'accorde un moment pour boire.", nom, prenom);
    }

    public void ami(Humain autre) {
        ami(autre, 100);
    }

    public void ami(Humain autre, int duree) {
        LOGGER.info("{} {} est maintenant ami avec {} {} pour {} jours.",
                this.nom, this.prenom, autre.nom, autre.prenom, duree);
    }
}
