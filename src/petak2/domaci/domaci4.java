package petak2.domaci;

import java.util.Scanner;

public class domaci4 {
    public static void main(String[] args) {
     //Napisati program koji koristi metodu za izracunavanje faktorijela unetog broja.
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj da biste izracunali njegov faktorijel: ");
        int broj = sc.nextInt();
        System.out.println("Faktorijel broja je: " + faktorijel(broj));
    }
    public static int faktorijel (int a) {
        int i = 1;
        int faktorijel = 1;
        while (i<=a){
            faktorijel*=i;
            i++;

        } return faktorijel;
    }
}

