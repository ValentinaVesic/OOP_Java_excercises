package Menjacnica;

public class Valuta {
    /*Domaci:
Dolar:
Nasledjuje klasu Valuta.
Konstruktor: Postavlja vrednosti za naziv "Dolar", simbol "USD", i trenutni kurs prema dinarima.
Dodatna Metoda: postaviKursNovi(kurs), koja postavlja novi kurs dolara.
Euro:
Nasledjuje klasu Valuta.
Konstruktor: Postavlja vrednosti za naziv "Euro", simbol "EUR", i trenutni kurs prema dinarima.
Dodatna Metoda: postaviKursNovi(kurs: number), koja postavlja novi kurs evra.
Napisati glavni program koji kreira objekte za dolar i evro, postavlja njihove kurseve, i vrsi
konverziju odredjenih iznosa iz jedne valute u drugu.*/

    private String naziv;
    private String simbol;
    private double kurs;

    public Valuta(String naziv, String simbol, double kurs) {
        this.naziv = naziv;
        this.simbol = simbol;
        this.kurs = kurs;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getSimbol() {
        return simbol;
    }

    public void setSimbol(String simbol) {
        this.simbol = simbol;
    }

    public double getKurs() {
        return kurs;
    }

    public void setKurs(double kurs) {
        this.kurs = kurs;
    }

    public void konvertujUdinare(int iznos) {
        System.out.println("Protivvrednost valute u dinarima je " + (getKurs() * iznos));
    }

    public String toString() {
        return "Ime valute je " + getNaziv() + ", simbol valute je:" + getSimbol() + ", a kurs " + getKurs();
    }
}
