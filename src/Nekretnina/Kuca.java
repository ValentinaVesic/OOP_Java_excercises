package Nekretnina;

import java.util.ArrayList;

public class Kuca extends Nekretnina{
    public Kuca(double kvadratura, double cenaPoKvadratu, ArrayList<Double> listaPonuda) {
        super(kvadratura, cenaPoKvadratu, listaPonuda);
    }

    /*Napraviti klasu Kuca koji nasledjuje klasu Nekretnina i on daje popust od
    20% ukoliko je kuca veca od 200 kvadrata.
*/

    @Override
    public double cena() {
        if (getKvadratura() > 200) {
            return ( (getKvadratura() * getCenaPoKvadratu()) * 0.80);
        } else {
            return (getKvadratura()* getCenaPoKvadratu());
        }
    }
}
