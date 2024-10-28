package petak2.domaci;

import java.util.Scanner;

public class domaci1 {
    public static void main(String[] args) {
        /*1. Napisati program koji trazi od korisnika da unese niz celih brojeva i vraca sumu svih
        elemenata niza
*/
        System.out.println("Unesite niz celih brojeva: ");
        Scanner sc = new Scanner(System.in);
        int[] niz = new int[15];
        int sum = 0;
        for (int i = 0; i < niz.length; i++) {
            niz[i] = sc.nextInt();
            sum += niz[i];
        }
        System.out.println("Suma niza je " + sum);
    }
}
