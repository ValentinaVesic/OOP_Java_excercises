package Nekretnine;

import java.util.ArrayList;

public class Stan extends Nekretnina {

    public Stan(int kvadratura, double cenaPoKv, ArrayList<Double> ponude) {
        super(kvadratura, cenaPoKv, ponude);
    }

    @Override
    public double cena() {
        double rezultat = getCenaPoKv()*getKvadratura();
        if(getKvadratura()>100) {
            rezultat*=0.85;
        }
        return rezultat;
    }
}
