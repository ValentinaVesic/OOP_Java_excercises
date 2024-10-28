package petak2.domaci;

import java.util.Scanner;

public class domaci3 {
    public static void main(String[] args) {
        //3. Napisati program koji koristi metode za ispisivanje kvadrata i korena unetog broja.

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite neki broj da biste izracunali njegov koren i kvadrat: ");
        double x = sc.nextDouble();
        koren(x);
        kvadrat(x);
    }

    public static void koren(double a) {
        double koren = Math.sqrt(a);
        System.out.println("Koren broja je: " + koren);
    }

    public static void kvadrat(double a) {
        double kvadrat = a * a;
        System.out.println("Kvadrat broja je: " + kvadrat);
    }
}
