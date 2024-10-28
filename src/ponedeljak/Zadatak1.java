package ponedeljak;

import java.util.Scanner;

public class Zadatak1 {

    public static void main(String[] args) {
        /*Kreirati dva proizvoljna broja i ponuditi korisniku jednu
        od tri operacije za primenu(mnozenje, ostatak i inkrement).
         */
        int x = 5;
        int y = 6;
        Scanner op = new Scanner(System.in);
        System.out.println("Unesite zeljenu operaciju.");
        System.out.println("Podrzane operacije su: *,%,++");

        String operacija = op.nextLine();

        switch (operacija.trim()) {
            case "*":
                System.out.println("Vas rezultat je: " + (x*y));
                break;
            case "%":
                System.out.println("Vas rezultat je: " + (x%y));
                break;
            case "++":
                System.out.println("Vasi rezultati su: " + (x++) + "i: " + (y++));
                break;

        }
    }
}
