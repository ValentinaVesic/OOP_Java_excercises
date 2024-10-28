package Nekretnina;

import java.util.ArrayList;

public class Nekretnina {

    /*Napraviti klasu Nekretnina koja ima kao atribut kvadraturu, cena po kvadratu i listu ponuda.
Napraviti metode:
- najvecaPonuda() -> vraca najvecu ponudu iz liste
- cena() -> vraca cenu nekretnine, ukoliko ima vise od 100 kvadrata, na ukupnu svotu dati popust od 15%
Napraviti klasu Stan koji nasledjuje klasu Nekretnina.
Napraviti klasu Kuca koji nasledjuje klasu Nekretnina i on daje popust od 20% ukoliko je kuca veca od 200 kvadrata.
Napraviti klasu Lokal nasledjuje klasu Nekretnina i on daje popust od 25% ukoliko je kuca veca od 250 kvadrata.*/


    private double kvadratura;
    private double cenaPoKvadratu;
    private ArrayList<Double> listaPonuda;

    public Nekretnina(double kvadratura, double cenaPoKvadratu, ArrayList<Double> listaPonuda){
        this.kvadratura=kvadratura;
        this.cenaPoKvadratu=cenaPoKvadratu;
        this.listaPonuda=listaPonuda;
    }

    public double getKvadratura() {
        return kvadratura;
    }

    public void setKvadratura(double kvadratura) {
        this.kvadratura = kvadratura;
    }

    public double getCenaPoKvadratu() {
        return cenaPoKvadratu;
    }

    public void setCenaPoKvadratu(double cenaPoKvadratu) {
        this.cenaPoKvadratu = cenaPoKvadratu;
    }

    public ArrayList<Double> getListaPonuda() {
        return listaPonuda;
    }

    public void setListaPonuda(ArrayList<Double> listaPonuda) {
        this.listaPonuda = listaPonuda;
    }

    public double najvecaPonuda(){
        double najveca = getListaPonuda().getFirst();
        for (int i = 1; i<getListaPonuda().size(); i++){
            if (getListaPonuda().get(i)>najveca){
                najveca = getListaPonuda().get(i);
            }
        }
        return najveca;
    }

    //- cena() -> vraca cenu nekretnine, ukoliko ima vise od 100 kvadrata,
    // na ukupnu svotu dati popust od 15%

    public double cena() {
        if (getKvadratura() > 100) {
            return ( (getKvadratura() * getCenaPoKvadratu()) * 0.85);
        } else {
            return (getKvadratura()* getCenaPoKvadratu());
        }
    }
}
