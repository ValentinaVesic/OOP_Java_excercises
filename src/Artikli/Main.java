package Artikli;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Artikl> test = new ArrayList<>();
        Artikl proba = new Artikl("Test", 14000.0,1996);
        Artikl proba1 = new Artikl("Test1", 1405.0,1989);
        Artikl proba2 = new Artikl("Test2", 1300.0, 2005);
        System.out.println(proba);


        test.add(proba);
        test.add(proba1);

        test.add(proba2);


        Prodavnica prod = new Prodavnica(10,test);
/*
        prod.blackFriday();

        System.out.println(proba);

        prod.pronadji("Test");

      //  prod.ukupnaZarada();

    //    System.out.println(prod.ukupnaZarada());

       // prod.izbaciPrestaro();

      //  System.out.println(test);*/

        prod.triftKolekcija();

        System.out.println(prod.triftKolekcija());

        HM hm = new HM(10,test);

        System.out.println(prod.ukupnaZarada());
        System.out.println(hm.ukupnaZarada());

        Zara zara = new Zara(10,test);
        System.out.println(zara.ukupnaZarada());

        Reserved reserved= new Reserved(10,test,100000000.0);
        System.out.println(reserved.ukupnaZarada());
        Reserved reserved1= new Reserved(10,test,5.0);
        System.out.println(reserved1.ukupnaZarada());

        System.out.println(reserved1);
    }
}
