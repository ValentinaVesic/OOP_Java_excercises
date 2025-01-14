package Planinarenje;

public class Planina {

    private String naziv;
    private double visina;
    private boolean opasnost;

    public Planina(String naziv, double visina, boolean opasnost) {
        this.naziv = naziv;
        this.visina = visina;
        this.opasnost = opasnost;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getVisina() {
        return visina;
    }

    public void setVisina(double visina) {
        this.visina = visina;
    }

    public boolean isOpasnost() {
        return opasnost;
    }

    public void setOpasnost(boolean opasnost) {
        this.opasnost = opasnost;
    }

    public String toString() {
        return "Planina " + naziv + " je visoka " + visina + " i opasna: " + opasnost;
    }
    //Napraviti klasu Planina
    //    atributi: naziv(String), visina(double ili int) i opasnost(Boolean)
}
