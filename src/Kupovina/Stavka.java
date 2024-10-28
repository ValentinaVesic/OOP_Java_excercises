package Kupovina;

public class Stavka {
    /*
    Zadatak 2:
Napraviti klasu Stavka koja ima od atributa naziv i cenu.
     */
    private String naziv;
    private double cena;

    public Stavka(String naziv, double cena) {
        this.naziv = naziv;
        this.cena=cena;
    }


    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String toString() {
        return naziv + " " + cena;
    }
}
