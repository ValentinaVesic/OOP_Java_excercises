package domaci_sreda;

import java.util.Scanner;

public class domaci4 {
    public static void main(String[] args) {
        /*2.Napisi program koji koristi while petlju da omogući korisniku unos dva broja. Program
treba da ispise rezultat deljenja prvog broja sa drugim. Petlja treba da se ponavlja u slucaju
da je drugi broj jednak nuli.*/

        Scanner scanner = new Scanner(System.in);
        double a = 0;
        double b = 0;

        System.out.println("Unesite prvi broj ");
        a = scanner.nextDouble();
        System.out.println("Unesite drugi broj");
        b = scanner.nextDouble();

        while (true) {
            if (b != 0) {
                System.out.println("Rezultat deljenja je: " + a / b);
                break;
            }
            System.out.println("Deljenje sa nulom nije dozvoljeno. Unesite drugi broj koji nije nula kojim cete deliti prvi broj.");
            b = scanner.nextDouble();
        }
    }
}