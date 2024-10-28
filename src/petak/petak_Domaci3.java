package petak;

import java.util.Scanner;

public class petak_Domaci3 {
    public static void main(String[] args) {
        /*Napisi jednostavan kalkulator koji trazi od korisnika da unese dva
        broja i operaciju (+ ili -). Na osnovu izbora korisnika, program treba da izvrsi
        odgovarajucu operaciju.
        (char operacija = sc.next().charAt(0); -> za ucitavanje znaka)
        *charAt(i) vraca karatker na i-tom mestu iz stringa, brojanje pocinje od 0 =>
        charAt(0) ->    vraca karakter na prvoj poziciji stringa */
        Scanner operacija = new Scanner(System.in);
        Scanner prvi_broj = new Scanner(System.in);
        Scanner drugi_broj = new Scanner(System.in);

        System.out.println("Unesite prvi broj:");
        double broj1 = prvi_broj.nextDouble();

        System.out.println("Unesite zeljenu operaciju: ");
        char sabiranje_oduzimanje = operacija.next().charAt(0);

        System.out.println("Unesite drugi broj: ");
        double broj2 = drugi_broj.nextDouble();

        if (sabiranje_oduzimanje == '-') {
            System.out.println("Rezultat je: " + (broj1 - broj2));
        } else if (sabiranje_oduzimanje == '+') {
            System.out.println("Rezultat je: " + (broj1 + broj2));
        } else {
            System.out.println("Operacija nije podrzana.");
        }
    }
}
