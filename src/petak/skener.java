package petak;

import java.util.Scanner;

public class skener {
    public static void main(String[] args) {
        Scanner skener = new Scanner(System.in); // Kreiramo nov skener i povezujemo ga sa konzolom.
        System.out.println("Unesite Vas proizvoljan broj po izboru: ");
        int broj = skener.nextInt();

        System.out.println("Broj koji ste uneli je: " + broj);
    }
}
