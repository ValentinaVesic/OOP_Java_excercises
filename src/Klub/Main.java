package Klub;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Igrac> listaIgraca = new ArrayList<>();

        Igrac a = new Igrac("Marko", 2, 1000);
        Igrac b = new Igrac("Milan", 1, 1060);
        Igrac c = new Igrac("Bojan", 1, 1500);
        Igrac d = new Igrac("Dragan", 5, 2000);
        Igrac e = new Igrac("Goran", 8, 8000);
        KosarkaskiKlub test1 = new KosarkaskiKlub("Zvezda", "Beograd", listaIgraca);
        OdbojkaskiKlub test2 = new OdbojkaskiKlub("Zvezdana", "Beograd", listaIgraca);
        FudbalskiKlub test3 = new FudbalskiKlub("Zvezdan", "Beograd", listaIgraca);

        listaIgraca.add(a);
        listaIgraca.add(b);
        listaIgraca.add(c);
        listaIgraca.add(d);
        listaIgraca.add(e);

        System.out.println(test1.najiskusnijiIgrac());
        System.out.println(test2.najiskusnijiIgrac());
        System.out.println(test3.najiskusnijiIgrac());

        System.out.println(test1.ukupnoPoena());
        System.out.println(test2.ukupnoPoena());
        System.out.println(test3.ukupnoPoena());

        test1.vrednosttima();
        test2.vrednosttima();
        test3.vrednosttima();

        System.out.println(test1.sampionTima());

        test3.najboljiStrelac();

        test1.vrednosttima();
        test2.vrednosttima();
        test3.vrednosttima();


    }
}
