package Automobili;

public class Main {
    public static void main(String[] args) {

        /*
        Zadatak 1:
Napraviti klasu Auto koja ima od atributa naziv modela, maksimalnu brzinu na sat, cenu i boju.
Napraviti metodu koja racuna za Koliko sati taj auto moze da predje 1000km.
Napraviti metodu koja smanjuje cenu za 10% ako je boja automobila ljubicasta.
Klasa mora imati adekvatan konstruktor i toString.
         */

        Auto a = new Auto("golf", 200, 1000, "ljubicasta");
        System.out.println(a);
        //  System.out.println(a.vremePredjenogPuta());
        //System.out.println(a.popustNaBoju());

    }
}