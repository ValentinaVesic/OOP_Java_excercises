package petak;

import java.util.Scanner;

public class petak_Domaci2 {
    public static void main(String[] args) {
        /*2. Napisati progam koji za uneti broj poena (0-100) dodeljuje odgovarajucu ocenu
        (6, 7, 8, 9, 10) prema sledecem ranigiranju
        51-60
        61-70
        71-80
        81-90
        91-100
        Ako je broj poena manji od 51, ispisati poruku da je broj bodova nedovoljan za
        polaganje ispita.
         */
        Scanner broj = new Scanner(System.in);
        System.out.println("Unesite broj poena da biste dobili odgovarajucu ocenu: ");
        int poeni = broj.nextInt();

        if (poeni >= 51 && poeni <= 60) {
            System.out.println("Vasa ocena je 6.");
        } else if (poeni >= 61 && poeni <= 70) {
            System.out.println("Vasa ocena je 7.");
        } else if (poeni >= 71 && poeni <= 80) {
            System.out.println("Vasa ocena je 8.");
        } else if (poeni >= 81 && poeni <= 90) {
            System.out.println("Vasa ocena je 9.");
        } else if (poeni >= 91 && poeni <= 100) {
            System.out.println("Vasa ocena je 10.");
        } else if (poeni < 51 && poeni > 0) {
            System.out.println("Broj poena je nedovoljan za polaganje ispita.");
        } else {
            System.out.println("Broj poena nije validan.");
        }

    }
}
