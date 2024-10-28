package Prodavnica;

public class Namirnica {

    String naziv;
    double cena;

    public Namirnica(String naziv, double cena) {
        this.naziv=naziv;
        this.cena=cena;
    }

    public String toString() {
        return naziv + " " + cena;
    }
}