package probnitest;

public class zadatak2 {
    public static void main(String[] args) {
            /*Zadatak 2:
Napraviti metodu koja prihvata niz celih brojeva i vraca najmanji broj iz niza.*/
        int[] niz1 = {540, 980, 7, 4, 65, 2};
        int najmanji = najmanjiBrojIzNiza(niz1);
        System.out.println(najmanji);

    }

    public static int najmanjiBrojIzNiza(int[] niz) {
        int minimum = niz[0];

        for (int i = 1; i < niz.length; i++) {
            if (niz[i] < minimum) {
                minimum = niz[i];
            }
        }
        return minimum;
    }
}
