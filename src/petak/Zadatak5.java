package petak;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        /*Napraviti program gde cete uneti koji je mesec u godini, u slucaju da su uneti
        "Jun" ili "Jul", ispisati poruku da su vrucine prevelike, u suprotnom ispisati da
        je temperatura stabilna.
        */

        Scanner skener = new Scanner(System.in);
        System.out.println("Unesite koji je mesec u godini: ");
        String mesec = skener.nextLine();

        if (mesec.equalsIgnoreCase("jun") || mesec.equalsIgnoreCase("jul") ){
            System.out.println("Vrucine su prevelike.");
        } else {
            System.out.println("Temperatura je stabilna.");
        }

    }
}
