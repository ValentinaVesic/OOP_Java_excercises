package Klub;

public class Igrac {

    private String ime;
    private int godineIskustva;
    private int brojPostignutihpoena;

    public Igrac(String ime, int godineIskustva, int brojPostignutihpoena){
        this.ime=ime;
        this.godineIskustva=godineIskustva;
        this.brojPostignutihpoena=brojPostignutihpoena;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getGodineIskustva() {
        return godineIskustva;
    }

    public void setGodineIskustva(int godineIskustva) {
        this.godineIskustva = godineIskustva;
    }

    public int getBrojPostignutihpoena() {
        return brojPostignutihpoena;
    }

    public void setBrojPostignutihpoena(int brojPostignutihpoena) {
        this.brojPostignutihpoena = brojPostignutihpoena;
    }

    @Override
    public String toString() {
        return "Igrac{" +
                "ime='" + ime + '\'' +
                ", godineIskustva=" + godineIskustva +
                ", brojPostignutihpoena=" + brojPostignutihpoena +
                '}';
    }
}
