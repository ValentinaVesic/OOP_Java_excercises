package petak;

import java.util.Scanner;

public class Zadatak4 {
    /*Uneti preko skenera neki broj, ukoliko je taj broj veci od 10 i paran,
    smanjiti ga za 1, u suprotnom ga povecati za 1.
     */
    public static void main(String[] args) {
        Scanner proba = new Scanner(System.in);
        System.out.println("Uneti broj: ");
        int broj = proba.nextInt();
        if (broj>10 && broj%2==0){
            System.out.println(--broj);
        } else {
            System.out.println(++broj);
        }
    }
}

