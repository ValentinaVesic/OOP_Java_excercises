package Nekretnina;

import java.util.ArrayList;

public class Lokal extends Nekretnina{
    public Lokal(double kvadratura, double cenaPoKvadratu, ArrayList<Double> listaPonuda) {
        super(kvadratura, cenaPoKvadratu, listaPonuda);
    }

    @Override
    public double cena() {
        if (getKvadratura() > 250) {
            return ( (getKvadratura() * getCenaPoKvadratu()) * 0.75);
        } else {
            return (getKvadratura()* getCenaPoKvadratu());
        }
    }
}
