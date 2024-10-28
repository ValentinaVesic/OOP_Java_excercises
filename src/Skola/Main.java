package Skola;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*
        Zadatak 2:
Napraviti klasu Student koji ima od atributa ime i listu ocena.
Napraviti metodu koja racuna studentov prosek.
Napraviti metodu koja proverava prosek I ukoliko je manji od 1.5 ispisati poruku da mora na popravni.
Klasa mora imati adekvatan konstruktor I toString.
         */

        ArrayList<Integer> ocene = new ArrayList<>();
        ocene.add(1);
        ocene.add(1);
        ocene.add(1);
        Student ucenik = new Student("Marko", ocene);
        System.out.println(ucenik.prosek());
        ucenik.popravni();


    }

}