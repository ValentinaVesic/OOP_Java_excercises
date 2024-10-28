package Probni;

public class Artikl {

    /*
    Napraviti klasu Artikl koji od atributa ima naziv, cenu I godinu proizvodnje.
     */

    private String naziv;
    private double cena;
    private int godina;

    public Artikl(String naziv, double cena, int godina) {
        this.naziv=naziv;
        this.cena=cena;
        this.godina=godina;
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

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public String toString() {
        return naziv + " " + cena + " " + godina;
    }
}
