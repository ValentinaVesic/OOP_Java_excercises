package petak;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        /*Uneti prvi broj preko skenera, zatim uneti drugi broj preko skenera i kao
        rezultat ispisati njihov zbir.
        Scanner skener = new Scanner(System.in); // Kreiramo nov skener i povezujemo ga sa konzolom.
        System.out.println("Unesite Vas proizvoljan broj po izboru: ");
        int broj = skener.nextInt();
         */

Scanner skener = new Scanner(System.in);
System.out.println("Unesite Vas prvi broj: ");
int prvi = skener.nextInt();
System.out.println("Unesite Vas drugi broj: ");
int drugi = skener.nextInt();

System.out.println("Zbir Vasih brojeva je: " + (prvi + drugi));





    }
}
