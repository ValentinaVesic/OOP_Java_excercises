package Probni;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Artikl a = new Artikl("Majica", 1000, 2022);
        Artikl a1 = new Artikl("Duks", 2000, 1990);
        Artikl a2 = new Artikl("Patike", 3000, 1995);
        Artikl a3 = new Artikl("Sat", 4000, 2022);

        ArrayList<Artikl> lista = new ArrayList<>();
        lista.add(a);
        lista.add(a1);
        lista.add(a2);
        lista.add(a3);

        Prodavnica p = new SportVision(3, lista);
        p.izbaciPrestaro();
        System.out.println(p.getArtikli());

    }
}
