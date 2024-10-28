package Planinarenje;

import java.util.ArrayList;

public class Main {

   /* Napraviti klasu Planina
    atributi: naziv(String), visina(double ili int) i opasnost(Boolean)
    Napraviti klasu Planinar
    atributi:lista planina, max uspon(maksimalna visina na koju taj planinar moze da se popne)
    Metode: -dodaj(Planina p) -> ubacuje datu planinu u listu ukoliko je njena visina manja ili
    jednaka max usponu
	-opasne() -> metoda vraca listu planina koje su opasne za penjanje
 	-izbaci() -> izbacuje planinu iz liste ukoliko je veca od max uspona nekog planinara ili ako je opasna
	-najveca()-> vraca najvecu planinu iz planinarove liste
    Napraviti klasu Rekreativac koji nasledjuje klasu Planinar.
    Napraviti klasu Amater koji nasledjuje klasu Planinar.
    Napraviti klasu Pro koji nasledjuje klasu Planinar koji iz svoje liste izbacuje samo planine
    koje su vece od njegovog maxUspon-a.
    Za sve klase je potrebno deklarisati dati konstruktor, get,set i toString.


*/

    public static void main(String[] args) {
        Planina p1 = new Planina("Zlatibor", 500.0, true);
        Planina p2 = new Planina("Kopaonik", 1000.0, false);
        Planina p3 = new Planina("Tara", 1500.0, false);
        Planina p4 = new Planina("Jastrebac", 2000.0, true);

        ArrayList<Planina> t1listaPlanina = new ArrayList<>();

        t1listaPlanina.add(p1);
        t1listaPlanina.add(p2);
        t1listaPlanina.add(p3);
        t1listaPlanina.add(p4);

        ArrayList<Planina> t2listaPlanina = new ArrayList<>();

        t2listaPlanina.add(p1);
        t2listaPlanina.add(p2);
        t2listaPlanina.add(p3);
        t2listaPlanina.add(p4);

        ArrayList<Planina> pro1listaPlanina = new ArrayList<>();

        pro1listaPlanina.add(p1);
        pro1listaPlanina.add(p2);
        pro1listaPlanina.add(p3);
        pro1listaPlanina.add(p4);

        Planinar t1 = new Planinar(t1listaPlanina, 6000.0);
        Planinar t2 = new Planinar(t2listaPlanina, 600.0);
        System.out.println(t1);

      /*  t2.izbaci();
        System.out.println(t2);
        System.out.println(t2.najveca());
        t2.izbaci();
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t2.najveca());
        System.out.println(t1.najveca());

        System.out.println(t2listaPlanina);*/


        Rekreativac pro1 = new Rekreativac(pro1listaPlanina, 6000);
        Planina p5 = new Planina("Mala planinica", 3000, true);
        pro1.dodaj(p5);

        pro1.izbaci();
        System.out.println(pro1.najveca());
        System.out.println(pro1);

    }

}

