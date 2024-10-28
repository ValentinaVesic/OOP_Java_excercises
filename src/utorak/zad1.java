package utorak;

public class zad1 {
    public static void main(String[] args) {
        /*Zadatak 2:
Pomocu while petlje izracunati sumu prvih 10 brojeva.*/

        int i = 0;
        int x = 0;
        int rezultat = 0;


        while (i<11) {
            rezultat = (x+=i);
            i++;
        }
        System.out.println("Rezultat je: " + rezultat );



    }
}
