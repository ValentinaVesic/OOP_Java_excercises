package bingo;

import java.util.Scanner;
import java.util.Random;

public class bingo {

    public static void main(String[] args) {
        int[] korisnikBrojevi = unesiBrojeve();
        int[] nasumicniBrojevi = generisi();

        bingo(korisnikBrojevi, nasumicniBrojevi);
    }

    public static int[] unesiBrojeve() {
        Scanner scanner = new Scanner(System.in);
        int[] brojevi = new int[6];

        System.out.println("Unesite 6 brojeva izmedju 1 i 49:");
        for (int i = 0; i < 6; i++) {
            brojevi[i] = scanner.nextInt();
            if (brojevi[i] > 49) {
                System.out.println("Broj koji ste uneli je veci od 49, pokrenite igru ponovo.");
                break;
            }
            if (brojevi[i] <= 0) {
                System.out.println("Broj koji ste uneli je manji od 0, pokrenite igru ponovo.");
                break;
            }
        }
        return brojevi;
    }

    public static int[] generisi() {
        Random random = new Random();
        int[] brojevi = new int[30];

        for (int i = 0; i < 30; i++) {
            brojevi[i] = random.nextInt(49) + 1;
        }

        return brojevi;
    }

    public static void bingo(int[] niz1, int[] niz2) {
        int pogodjeni = 0;
        for (int broj : niz1) {
            for (int nasumicni : niz2) {
                if (broj == nasumicni) {
                    pogodjeni++;
                }
            }
        }

        if (pogodjeni >= 6) {
            System.out.println("Bingo!");
        } else {
            System.out.println("Nije bingo....");
        }
    }
}
