package Nekretnine;

import java.util.ArrayList;

public class Kuca extends Nekretnina{
    public Kuca(int kvadratura, double cenaPoKv, ArrayList<Double> ponude) {
        super(kvadratura, cenaPoKv, ponude);
    }

    @Override
    public double cena() {
       double rezultat = getCenaPoKv()*getKvadratura();
       if(getKvadratura()>200) {
           rezultat*=0.8;
       }
       return rezultat;
    }
}
