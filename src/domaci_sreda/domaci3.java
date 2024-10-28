package domaci_sreda;

import java.util.Scanner;

public class domaci3 {
    public static void main(String[] args) {
/*1. Napisi program koji koristi do-while petlju da omoguci korisniku unos lozinke sve dok ne
unese ispravnu lozinku. Ispravna lozinka moze biti unapred inicijalozovana.
 */
        System.out.println("Unesite lozinku:");
        Scanner skener = new Scanner(System.in);
        String lozinka = "Lozinka123!";
        String unosLozinke = skener.nextLine();


        while (!unosLozinke.equals(lozinka)) {
            System.out.println("Lozinka nije ispravna.");
            unosLozinke = skener.nextLine();
        }
        do {
            System.out.println("Lozinka je ispravna.");
            break;

        } while (unosLozinke.equals(lozinka));
    }
}
