package Nekretnine;

import java.util.ArrayList;

public abstract class Nekretnina {

    /*
    Zadatak 1:
Napraviti klasu Nekretnina koja ima kao atribut kvadraturu, cena po kvadratu i
listu ponuda.
Napraviti metode:
- najvecaPonuda() -> vraca najvecu ponudu iz liste
- cena() -> vraca cenu nekretnine, ukoliko ima vise od 100 kvadrata, na ukupnu svotu
dati popust od 15%

Napraviti klasu Stan koji nasledjuje klasu Nekretnina.
Napraviti klasu Kuca koji nasledjuje klasu Nekretnina i on daje popust od 20% ukoliko
 je kuca veca od 200 kvadrata.
Napraviti klasu Lokal nasledjuje klasu Nekretnina i on daje popust od 25% ukoliko je
 lokal veci od 250 kvadrata.
     */


    private int kvadratura;
    private double cenaPoKv;
    private ArrayList<Double> ponude;

    public Nekretnina(int kvadratura, double cenaPoKv, ArrayList<Double> ponude) {
        this.kvadratura = kvadratura;
        this.cenaPoKv = cenaPoKv;
        this.ponude=ponude;
    }

    public double najvecaPonuda() {
        double max = getPonude().get(0);
        for(Double d:getPonude()) {
            if(d>max) {
                max=d;
            }
        }
        return max;
    }


    public int getKvadratura() {
        return kvadratura;
    }

    public void setKvadratura(int kvadratura) {
        this.kvadratura = kvadratura;
    }

    public double getCenaPoKv() {
        return cenaPoKv;
    }

    public void setCenaPoKv(double cenaPoKv) {
        this.cenaPoKv = cenaPoKv;
    }

    public ArrayList<Double> getPonude() {
        return ponude;
    }

    public void setPonude(ArrayList<Double> ponude) {
        this.ponude = ponude;
    }

    public abstract double cena();

    public String toString() {
        return cenaPoKv + " " + kvadratura + " " + ponude;
    }
}
