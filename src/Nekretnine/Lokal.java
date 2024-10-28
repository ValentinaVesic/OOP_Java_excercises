package Nekretnine;

import java.util.ArrayList;

public class Lokal extends Nekretnina{

    public Lokal(int kvadratura, double cenaPoKv, ArrayList<Double> ponude) {
        super(kvadratura, cenaPoKv, ponude);
    }

    @Override
    public double cena() {
       double rezultat = getCenaPoKv()*getKvadratura();
       if(getKvadratura()>250) {
           rezultat*=0.75;
       }
       return rezultat;
    }
}
