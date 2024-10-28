package Nekretnina;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Double> listaPonuda= new ArrayList<>();
        listaPonuda.add(15000.0);
        listaPonuda.add(17000.0);
        listaPonuda.add(2500000.0);

        Nekretnina nekretnina = new Lokal(300,10, listaPonuda);

        nekretnina.najvecaPonuda();
        System.out.println(nekretnina.najvecaPonuda());

        nekretnina.cena();
        System.out.println(nekretnina.cena());
    }
}
