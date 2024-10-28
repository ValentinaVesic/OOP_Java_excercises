package petak2;

public class zad3 {
    public static void main(String[] args) {
        /*Zadatak 3:
a)Napraviti metodu koja prima niz celih brojeva i povecava sve brojeve za 1.
b)Napraviti metodu koja je zaduzena za stampanje nizova

         */
        int[] niz = {1,2,3,4};
        povecavanjeNiza(niz);
        stampanjeNiza(niz);
    }

    public static void povecavanjeNiza(int[] niz){
        for (int i = 0; i<niz.length; i++) {
            niz[i]++;
        }
    }

    public static void stampanjeNiza(int[] neki) {
        for (int i = 0; i<neki.length; i++) {
            System.out.println(neki[i]);
        }
    }
}
