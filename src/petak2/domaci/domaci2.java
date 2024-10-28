package petak2.domaci;

import java.util.Scanner;

public class domaci2 {
    public static void main(String[] args) {
        /*2. Napisati program koji trazi od korisnika da unese niz celih brojeva
        i vraca maksimalni element u nizu*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite niz od 10 celih brojeva: ");
        int[] niz = new int[11];

        for (int i = 0; i < niz.length; i++) {
            niz[i] = sc.nextInt();
        }

        int prvi = niz[0];

        for (int i = 1; i < niz.length; i++) {
            if (niz[i] > prvi) {
                prvi = niz[i];
            }
        }
        System.out.println("Najveci broj u nizu je " + prvi);
    }
}