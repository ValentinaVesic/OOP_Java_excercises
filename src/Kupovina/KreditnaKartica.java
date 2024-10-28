package Kupovina;

public class KreditnaKartica {
    /*
    Zadatak 2:
Napraviti klasu KreditnaKartica koja od atributa ima stanje na racunu.
     */
    private double stanje;

    public KreditnaKartica(double stanje) {
        this.stanje=stanje;
    }

    public double getStanje() {
        return stanje;
    }

    public void setStanje(double stanje) {
        this.stanje = stanje;
    }

    public String toString() {
        return stanje + " ";
    }
}
