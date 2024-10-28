package domaci_sreda;

import java.util.Scanner;


public class domaci2 {
    public static void main(String[] args) {
        /*
        2. Napisi program koji koristi for petlju da proveri da li je broj N prost.
        Korisnik treba da unese vrednost N, a program treba da ispita da li je taj broj deljiv
        samo sa 1 i sa samim sobom. Ispiši odgovarajuću poruku.
         */

        System.out.println("Unesite bilo koji broj da biste proverili da li je u pitanju prost broj: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int delioci = 0;

        if (n == 0 || n == 1) {
            System.out.println("Brojevi 0 i 1 nisu pokriveni ovim programom.");
        }
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                delioci++;
            }
        }
        // Necu ni tebi da zaboravim ovo, a ni sebi koliko sam srecna sto radi :D
        if (delioci == 2) {
            System.out.println("Vas broj je prost.");
        } else if (delioci > 2) {
            System.out.println("Vas broj nije prost.");
        }
    }
}
