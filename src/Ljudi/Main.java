package Ljudi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi ime: ");
        String ime = sc.nextLine();


        Covek c = new Covek(ime,"Tomin",12345,1998);
        Covek c1 = new Covek("Dejan", "Grujic",54321, 2000);

        System.out.println("Moje ime je: " + c.ime + " Moje prezime je: " + c.prezime);
        System.out.println(c);
        c.pozdraviSe();





    }


}