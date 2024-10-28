package ponedeljak;

import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        /*Definisati neku fiksnu platu. Unesite radnu poziciju (moze biti Mehanicar,
        Fizikalac ili Sef), ukoliko ste fizikalac na fiksnu platu imate bonus od 1000,
        ukoliko ste Mehanicar imate bonus od 1500 a Sef 2000 bonus na platu. Istampati
        koliku radnik ima platu.
*/
        Scanner sc = new Scanner(System.in);
        int fiksna_plata = 1000;
        System.out.println("Unesite vasu radnu poziciju: ");
        String radna_pozicija = sc.nextLine();

    switch (radna_pozicija.toLowerCase()){
        case "fizikalac":
            System.out.println("Vasa plata je" + (fiksna_plata +1000));
            break;
        case "mehanicar":
            System.out.println("Vasa plata je: " + (fiksna_plata + 1500));
            break;
        case "sef":
            System.out.println("Vasa plata je: " + (fiksna_plata + 2000));
            break;
        default: {
                System.out.println("Vasa radna pozicija nije validna.");
            }

    }
}
}
