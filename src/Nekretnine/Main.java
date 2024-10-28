package Nekretnine;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Double> ponude = new ArrayList<>();
        ponude.add(100000.0);
        ponude.add(20000.0);
        ponude.add(500.0);

        Nekretnina n1 = new Lokal(260, 1000,ponude );
        System.out.println(n1.cena());
    }
}
