package probnitest;

public class zadatak4 {
    public static void main(String[] args) {
        /*Zadatak 4(Ogledalo):
Napraviti metodu koja prihvata niz brojeva i kao rezultat vraca taj niz samo u obrnutom redosledu.*/
        int[] niz1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 15};
        obrnutiRedosled(niz1);


    }

    // resenje koje daje novi Niz
    public static int[] noviNiz(int[] niz1) {
        int[] niz2 = new int[niz1.length];
        int duzinaPrvogNiza = niz1.length;
        for (int i = 0; i < niz1.length; i++) {
            duzinaPrvogNiza--;
            niz2[i] = niz1[duzinaPrvogNiza];
        }
        return niz2;
    }

    // resenje koje stampa u obrnutom redosledu
    public static void obrnutiRedosled(int[] niz1) {
        for (int i = niz1.length - 1; i > (-1); i--) {
            System.out.println(niz1[i]);
        }
    }
}






